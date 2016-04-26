package srm689;
import org.junit.Test;
import static org.junit.Assert.*;
import static srm689.NonDeterministicSubstring.ways;

public class NonDeterministicTest {
    
    @Test 
    public void waysTest() {
        assertEquals(ways("1101010101111010101011111111110001010101", "???????????????????????????????????"), 6);
        assertEquals(ways("00000000", "??0??0"), 1);
        assertEquals(ways("001010101100010111010", "???"), 8);
    }

}
