package codility.prefix_sum;

public class MinAverage {

    public static int minAverage(int[] A) {
        double minValue = Double.MAX_VALUE;
        int minIndex = -1;
        for(int i = 1; i < A.length; i++) {
            double sumPrevOne = A[i]+A[i-1];
            double prevOne = sumPrevOne/ (double) 2;
            double prevTwo = Double.MAX_VALUE;
            int idxTemp = i-1;
            if(i > 2)
                prevTwo = (sumPrevOne + A[i-2])/(double) 3;
            if( prevOne > prevTwo ) {
                prevOne = prevTwo;
                idxTemp =  i-2;
            } 
            if(minValue > prevOne) {
                minValue = prevOne;
                minIndex = idxTemp;
            }
        }
        return minIndex;
    }
}
