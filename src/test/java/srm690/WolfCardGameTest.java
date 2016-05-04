package srm690;

import static org.junit.Assert.assertEquals;
import static srm690.WolfCardGame.createAnswer;

import org.junit.Test;

public class WolfCardGameTest {

    @Test 
    public void createAnswerTest() {
        int [] expected = {3,6,9,12};
        int [] result = createAnswer(20, 4);
        for(int i= 0; i < result.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

}
