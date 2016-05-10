package tcc04;

public class BadNeighbors {

    public static int maxDonations(int [] donations) {
        int [] records = new int[donations.length];
        int max = -1;
        for(int i = 0; i < donations.length; i++) {
            if(i-1 >= 0 && i != donations.length-1) {
                max = Math.max(donations[i] + (i-2>=0? records[i-2]:0), records[i-1]);
            } else if(i-1>=0 && i == donations.length-1) {
                max = Math.max(donations[i] +  (i-2>=0? records[i-2] - donations[0]:0), records[i-1]);
                max = Math.max((i-2>=0? records[i-2]:0), max);
            } else {
                max = donations[i];
            }
            records[i] = max;
        }
        
        return records[donations.length-1];
    }
}
