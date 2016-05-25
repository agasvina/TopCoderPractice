package codility.stack_queue;

import java.util.Stack;

public class Fish {
    public static int countAlive(int[] A, int[] B) {
        int safedFish = 0;
        Stack<Integer> predators = new Stack<>();
        for(int i = 0; i < A.length; i++) {
            if(B[i] == 1) {
                predators.add(A[i]);   
            } else {
                while(!predators.isEmpty() && predators.peek() < A[i] ) {
                    predators.pop();
                }
                if(!predators.isEmpty() && predators.peek() > A[i]) continue;
                safedFish++;
            }
        }
        return safedFish + predators.size();
    }
}
