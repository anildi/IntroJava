package ttl.labs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author whynot
 */
public class TestLab3 {

    @Test
    public void testCreateArray() {
        int size = 10;
        int limit = 1000;
        int [] result = Lab3.createArray(size, limit);

        assertEquals(size, result.length);

        boolean allGood = true;
        for(int i : result) {
            if(i > limit) {
                allGood = false;
                break;
            }
        }

        assertTrue(allGood);
    }
}
