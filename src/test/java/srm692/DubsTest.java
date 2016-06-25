package srm692;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DubsTest {

    @Test 
    public void count1() {
        assertEquals(0, Dubs.count(10, 10));
        assertEquals(1, Dubs.count(10, 20));
        assertEquals(6, Dubs.count(49, 101));
        assertEquals(11000001, Dubs.count(1111111, 111111111));
    }

}
