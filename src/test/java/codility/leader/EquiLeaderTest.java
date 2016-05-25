package codility.leader;

import static codility.leader.EquiLeader.totalLeaders;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EquiLeaderTest {
    
    @Test 
    public void leaderTest() {
        int [] A = {4,3,2,1,5};
        assertEquals(0, totalLeaders(A));
        
        int [] B = {8,8,2,8,8};
        assertEquals(4, totalLeaders(B));
    }

}
