package tco.algo2016_2c;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BearBallTest {
    
   @Test
   public void countTest() {
       int [] X = {-100, -90, -80, -70, -85, -90, 0, 20};
       int [] Y = {-5, -8, -13, -21, -13, -13, -13, -69};
       assertEquals(68, BearBall.countThrows(X, Y));
       
       int [] A = {0,0,0,1,1};
       int [] B = {0,1,2,0,1};
       assertEquals(22, BearBall.countThrows(A, B));
   }

}
