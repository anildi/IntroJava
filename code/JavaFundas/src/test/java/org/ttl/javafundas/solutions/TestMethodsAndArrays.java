package org.ttl.javafundas.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author whynot
 */
public class TestMethodsAndArrays {

    @Test
    public void testMethodsAndArrays() {
        int size = 10;
        int limit = 100;

        int [] iarr = MethodsAndArrays.createArray(size, limit);

        assertEquals(size, iarr.length);

        int max = Integer.MIN_VALUE;
        for (int j : iarr) {
            if (j > max) {
                max = j;
            }
        }

        assertTrue(max < limit);
    }
}
