package codility.stack_queue;

import static codility.stack_queue.Brackets.isNestedProperly;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BracketTest {

    @Test 
    public void countTest() {
        assertEquals(1, isNestedProperly(""));
        assertEquals(1, isNestedProperly("([][])"));
        assertEquals(0, isNestedProperly("()()[)"));
    }
}
