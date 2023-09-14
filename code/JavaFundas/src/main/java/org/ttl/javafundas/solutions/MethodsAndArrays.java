package org.ttl.javafundas.solutions;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author whynot
 */
public class MethodsAndArrays {

    public static void main(String[] args) {

    }

    public static int [] createArray(int size, int limit) {
       int [] iarr = new int[size];
       for(int i = 0; i < iarr.length; i++) {
           iarr[i] = ThreadLocalRandom.current().nextInt(0, limit);
       }

       return iarr;
    }
}
