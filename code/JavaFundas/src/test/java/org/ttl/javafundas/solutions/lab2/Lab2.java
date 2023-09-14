package org.ttl.javafundas.solutions.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author whynot
 */
public class Lab2 {

    @Test
    public void testLoopingFor3or7() {
        int count = 0;
        int both = 0;
        int start = -500;
        int end = 500;
        int num = end - start + 1;
        for (int i = -500; i <= 500; i++) {
//           if(i % 3 == 0 || i % 7 == 0) {
//               System.out.println(i + " is divisible by either 3 or 7");
//               count++;
//           }
//           if(i % 3 == 0 && i % 7 == 0) {
//               System.out.println(i + " is divisible by BOTH 3 or 7");
//               count++;
//           }

            if (i % 3 == 0) {
                System.out.println(i + " is divisible by 3");
                count++;
            }
            if (i % 7 == 0) {
                System.out.println(i + " is divisible by 7");
                count++;
            }
        }
        System.out.println("Total Count: " + count + ", BOTH = " + both);
        assertEquals(476, count);
        assertEquals(num / 3 + num / 7, count);
    }

    @Test
    public void testLoopingWhile3Or7() {
        int count = 0;
        int both = 0;
        int start = -500;
        int end = 500;
        int num = end - start + 1;
        int i = -500;
        while(i <= 500) {
//           if(i % 3 == 0 || i % 7 == 0) {
//               System.out.println(i + " is divisible by either 3 or 7");
//               count++;
//           }
//           if(i % 3 == 0 && i % 7 == 0) {
//               System.out.println(i + " is divisible by BOTH 3 or 7");
//               count++;
//           }

            if (i % 3 == 0) {
                System.out.println(i + " is divisible by 3");
                count++;
            }
            if (i % 7 == 0) {
                System.out.println(i + " is divisible by 7");
                count++;
            }

            i++;
        }
        System.out.println("Total Count: " + count + ", BOTH = " + both);
        assertEquals(476, count);
        assertEquals(num / 3 + num / 7, count);
    }
}
