package org.ttl.javafundas.labs.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;

/**
 * If Mixer receives 3 or less arguments, Mixer sorts the arguments
 * using Arrays.sort and prints the resultant sorted array.
 * <p>
 * If Mixer receives more than 3 arguments, Mixer sorts the arguments,
 * counts the frequency of each argument, and prints the arguments
 * and their frequency in sorted order.
 * <p>
 *
 * @author developintelligence llc
 * @version 1.0
 */
public class Mixer {

    @Test
    public void testMixer() {
        String [] args = {"A", "very", "very", "shiny", "shiny", "day"};
        //write Mixer logic here
        switch (args.length) {
            case 0:
                break;
            case 1:
            case 2:
            case 3:
                Arrays.sort(args);
                System.out.println(Arrays.toString(args));
                break;
            default:
                Arrays.sort(args);
                Map frequencyMap = getFrequencyMap(args);
                printFrequenceMap(frequencyMap);
                break;
        }
    }


    private static Map getFrequencyMap(String[] args) {
        Map returnMap = new TreeMap();
        List list = Arrays.asList(args);

        //converted to for-each syntax
        for (Object arg : list) {
            if (!returnMap.containsKey(arg)) {
                int freq = Collections.frequency(list, arg);
                //converted to use auto-boxing
                returnMap.put(arg, freq);
            }
        }

        return returnMap;
    }

    private static void printFrequenceMap(Map frequencyMap) {
        Iterator keys = frequencyMap.keySet().iterator();
        while (keys.hasNext()) {
            String key = (String) keys.next();
            //converted to use auto-unboxing
            int value = (Integer) frequencyMap.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
