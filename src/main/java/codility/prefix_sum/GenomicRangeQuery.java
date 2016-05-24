package codility.prefix_sum;

public class GenomicRangeQuery {
    
    public static int[] minImpact(String S, int[] P, int[] Q) {
        //Pay more attention toward indexing.. 
        int [][] totalGnomes = new int[4][S.length()+1];
        for(int i = 1; i < S.length()+1; i++) { 
            int idx = -1;
            if( S.charAt(i-1) == 'A') {
               idx = 1;
            } else if (S.charAt(i-1) == 'C') {
                idx = 2;
            } else if(S.charAt(i-1) == 'G') {
                idx = 3;
            }
            
            totalGnomes[1][i] = totalGnomes[1][i-1];
            totalGnomes[2][i] =  totalGnomes[2][i-1]; 
            totalGnomes[3][i] =  totalGnomes[3][i-1];
            if(idx != -1) totalGnomes[idx][i] = totalGnomes[idx][i-1]+1;
            
        }
        int [] result = new int[P.length];
        for(int i = 0; i < P.length; i++) {
            if(totalGnomes[1][Q[i] +1] - totalGnomes[1][P[i]] > 0) {
                result[i] = 1;   
            } else if (totalGnomes[2][Q[i] + 1] - totalGnomes[2][P[i]] > 0) {
                result[i] = 2;   
            } else if (totalGnomes[3][Q[i] + 1] - totalGnomes[3][P[i]] > 0) {
                result[i] = 3;
            } else {
                result[i] = 4;   
            }
        }
        return result;
    }
    

}
