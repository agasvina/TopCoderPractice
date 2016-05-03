package srm687;

import java.util.Arrays;

public class Quorum {

    public static int count(final int[] arr, final int k) {
        Arrays.sort(arr); //O(nLogn)
        int attendee = 0;
        for(int i = 0; i < k; i++) { 
            attendee += arr[i];
        } //O(k) <= O(n) 
        return attendee; //total: O(nLogn)
    }
}
