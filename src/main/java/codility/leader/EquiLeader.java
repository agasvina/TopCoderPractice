package codility.leader;

import java.util.HashMap;
import java.util.Map;

public class EquiLeader {

    public static int totalLeaders(int[] A) {
        Map<Integer, Integer> tre = new HashMap<>();
        Map<Integer, Integer> tle = new HashMap<>();
        tre.put(Integer.MAX_VALUE, -1);
        tle.put(Integer.MIN_VALUE, -1);
        
        int [] rightLeader = new int[A.length];
        int [] leftLeader = new int[A.length];
        rightLeader[0] = A[0];
        leftLeader[A.length-1] = A[A.length-1];
        
        for(int i = 0; i < A.length; i++) {
            //RIGHT:
            if(tre.get(A[i]) == null) 
                tre.put(A[i],1);
            else tre.put(A[i], tre.get(A[i])+1);
            
            //LEFT:
            int j = A.length-i-1;
            if(tle.get(A[j]) == null) 
                tle.put(A[j],1);
            else tle.put(A[j], tle.get(A[j])+1);

            if(i == 0) continue;
            
            //RIGHT:
            int leader = Integer.MAX_VALUE;
            if(tre.get(A[i]) > tre.get(rightLeader[i-1])) 
                leader = A[i];
             else if(tre.get(A[i]) < tre.get(rightLeader[i-1])) 
                leader = rightLeader[i-1];
             else if(A[i] == rightLeader[i-1])
                leader = A[i];
            
            if(tre.get(leader) != null && tre.get(leader)> (i+1)/2) 
                rightLeader[i] = leader;   
            else 
                rightLeader[i] = Integer.MAX_VALUE;   
            
            //LEFT  
            leader = Integer.MIN_VALUE;
            if(tle.get(A[j]) > tle.get(leftLeader[j+1])) 
                leader = A[j];
            else if (tle.get(A[j]) < tle.get(leftLeader[j+1])) 
                leader = leftLeader[j+1];
            else if (A[j] ==leftLeader[j+1]) 
                leader = A[j];
            if(tle.get(leader) != null && tle.get(leader)>(i+1)/2) 
                leftLeader[j] = leader;   
             else 
                leftLeader[j] = Integer.MIN_VALUE;   
        }
        //CHECK ALL LEADERS
        int counter = 0;
        for(int i = 0; i < A.length-1; i++) {
            if(rightLeader[i] == leftLeader[i+1]) 
                counter++;
        }
        return counter;
    }
}