package org.ttl.javafundas.slideexamples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author whynot
 */
public class TestFlowControl {

    @Test
    public void testIfDemo() {
       FlowControl fc = new FlowControl();

       int result = fc.ifDemo();

       assertEquals(20, result);
    }

    @Test
    public void testForLoopDemo() {

        FlowControl fc = new FlowControl();

        int result = fc.forLoopDemo();

        assertEquals(500500, result);
    }

    @Test
    public void testWhileLoopDemo() {

        FlowControl fc = new FlowControl();

        int result = fc.whileLoopDemo();

        assertEquals(500500, result);
    }

    @Test
    public void testDoWhileLoop() {

        FlowControl fc = new FlowControl();

        int result = fc.doWhileLoopDemo();

        assertEquals(500500, result);
    }

    @Test
    public void whileVsDoWhile() {
        int i = 10;
        int sum = 0;

        while(i > 10) {
            sum += i;
            i--;
        }

        assertEquals(0, sum);

        //Do it again, with a do/while
        sum = 0;
        i = 10;
        do {
            sum += i;
            i--;
        }while(i > 10);

        assertEquals(10, sum);
    }

    @Test
    public void testSwitchDemo() {
        FlowControl fc = new FlowControl();

        int result = fc.switchDemo(10);
        assertEquals(1, result);

        result = fc.switchDemo(96);
        assertEquals(-1, result);
    }
}
