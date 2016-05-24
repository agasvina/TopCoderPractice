package codility.prefix_sum;

import static codility.prefix_sum.GenomicRangeQuery.minImpact;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GnomicRangeQueryTest {
    
    @Test
    public void singleElement() {
        int [] P = {0};
        int [] Q = {0};
        assertEquals(minImpact("A", P, Q)[0], 1);
    }
    
    @Test
    public void severalElements() {
        int [] P = {2,5,0};
        int [] Q = {4,5,6};
        int [] expected = {2,4,1};
        int [] result = minImpact("CAGCCTA", P, Q);
        for(int i = 0; i < result.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }
}
