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
