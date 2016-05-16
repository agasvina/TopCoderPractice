package tco.algo2016_2a;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LCMGCDTest {

    @Test
    public void isPossibleTest() {
        int [] w = {72,16,16,16,16,16,27,27,27,27,27,27,27,27,27};
        assertEquals("Possible", LCMGCD.isPossible(w, 72));
        int [] x = {2,3};
        assertEquals("Possible", LCMGCD.isPossible(x, 6));
        int [] y = {100663296, 544195584, 229582512, 59049};
        assertEquals("Possible", LCMGCD.isPossible(y, 60466176));
        int [] z = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        assertEquals("Possible", LCMGCD.isPossible(z, 1));
       
    }
}
