/*
 * IBM Confidential
 *
 * OCO Source Materials
 *
 * © Copyright IBM Corp. 2015, 2016
 *
 * The source code for this program is not published or otherwise
 * divested of its trade secrets, irrespective of what has been
 * deposited with the U.S. Copyright Office.
 */
package tco.algo2016_2c;

import java.util.LinkedList;
import java.util.Queue;

public class BearBall {

    //TOTAL COMPLEXITY: O(N*N*(N+N)) = O(N^3)
    public static int countThrows(int [] X, int [] Y) {
        Point [] points = new Point[X.length];
        for(int i = 0; i < X.length; i++) {
            points[i] = new Point(X[i], Y[i]);
        }
        int [][] graph = new int[X.length][Y.length];
        for(int i = 0; i < X.length;  i++) {
            for(int j = 0; j < Y.length && j != i; j++) {
                int dist = 1;
                Point pointi = points[i];
                Point pointj = points[j];
                for(int k = 0; k < points.length; k++) {
                    if(k == i ) continue;
                    if(k == j ) continue;
                    if(inLine(pointi, pointj, points[k])) {
                        dist++;
                    }
                }
                graph[i][j] = dist;
                graph[j][i] = dist;
            }
        }
        int counter = 0; 
        for(int i = 0; i < X.length; i++) {
            for(int j = 0; j < Y.length; j++) {
                if(graph[i][j] > 2) {
                    int [] distances = getJourney(graph, i);
                    for(int k = j; k < Y.length; k++) {
                        if(graph[i][k] > 2) {
                            graph[i][k] = distances[k];
                            graph[k][i] = distances[k];
                        }
                        counter += graph[i][k];
                    }
                    break;
                }
                counter += graph[i][j];
            }
        }
        return counter;
    }
    
    public static int[] getJourney(int [][] graph, int source) {
        int [] distance = new int[graph.length];
        
        for(int i = 0; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        
        Queue<Journey> inProcessNodes = new LinkedList<>();
        inProcessNodes.add(new Journey(0,source));
        distance[source] = 0;
        
        while(!inProcessNodes.isEmpty()) {
            Journey current = inProcessNodes.remove();
            for(int i = 0; i < graph[current.point].length; i++) {
                if( i == current.point) continue;
                int newDistance = current.distance + graph[current.point][i];
                if(distance[i] > newDistance ) {
                    inProcessNodes.add(new Journey(newDistance, i));
                    distance[i] = newDistance;
                }
            }
        }
        return distance;
    }
    
    public static boolean inLine(Point point1, Point point2, Point currPoint) {
        int dxc = currPoint.x - point1.x;
        int dyc = currPoint.y - point1.y;

        int dxl = point2.x - point1.x;
        int dyl = point2.y - point1.y;

        int cross = dxc * dyl - dyc * dxl;
        
        if (cross != 0)
            return false;
        if (Math.abs(dxl) >= Math.abs(dyl))
            return dxl > 0 ? 
              point1.x <= currPoint.x && currPoint.x <= point2.x :
              point2.x <= currPoint.x && currPoint.x <= point1.x;
          else
            return dyl > 0 ? 
              point1.y <= currPoint.y && currPoint.y <= point2.y :
              point2.y <= currPoint.y && currPoint.y <= point1.y;
    }
    
    private static class Point {
        public int x;
        public int y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
   
    public static class Journey {
        public int distance;
        public int point;
        
        public Journey(int distance, int point) {
            this.distance = distance;
            this.point = point;
        }
    }
}


