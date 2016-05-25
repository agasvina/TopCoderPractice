package codility.stack_queue;

import static org.junit.Assert.assertEquals;
import static codility.stack_queue.Fish.countAlive;
import org.junit.Test;

public class FishTest {
    
    @Test 
    public void countTest() {
        int [] A = {4,3,2,1,5};
        int [] B = {0,1,0,0,0};
        assertEquals(2, countAlive(A, B));
    }
}
