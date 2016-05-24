package codility.prefix_sum;

import static codility.prefix_sum.MinAverage.minAverage;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinAverageTest {
    
    @Test
    public void positiveTest() {
        int [] A = { 4, 2, 2, 5, 1, 5, 8 };
        assertEquals(1, minAverage(A));
    }
    
    @Test
    public void negativeTest() {
        int [] A = { -5400, -200, -10000, -10000, -1, -5, -8000};
        assertEquals(2, minAverage(A));
    }
}
