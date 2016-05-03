package srm687;

import static org.junit.Assert.assertEquals;
import static srm687.Quorum.count;

import org.junit.Test;

public class QuorumTest {
    
    @Test 
    public void countTest() {
        int [] arr = {50,2,9,49,38};
        assertEquals(count(arr, 3), 49);
        
        int [] arr2 = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        assertEquals(count(arr2, 14), 105);
        
        int [] arr3 = {1,1,1,1,1};
        assertEquals(count(arr3, 5), 5);
    }


}
