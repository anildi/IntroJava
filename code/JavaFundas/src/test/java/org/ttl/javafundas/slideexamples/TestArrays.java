package org.ttl.javafundas.slideexamples;

import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author whynot
 */
public class TestArrays {

    @Test
    public void basicArrays() {
        //A reference to an int array.  It is NOT
        //referring to anything right now;
        int [] iarr;
        //To make it point at an array, we have to
        //create the array with a 'new'.  Here we
        //make a 10 element array;
        iarr = new int[10];

        for(int i = 0, val = 1; i < iarr.length; i++, val++) {
           iarr[i] = val;
        }

        assertEquals(10, iarr[iarr.length - 1]);
    }

    @Test
    public void arraysInitialization() {
        int [] iarr = { 0, 10, 25 };
        assertEquals(25, iarr[iarr.length - 1]);

        String [] messages = {"Hello", "Not Hello", "Maybe Hello"};

        assertEquals("Not Hello", messages[1]);

    }
}
