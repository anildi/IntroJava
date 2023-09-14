package org.ttl.javafundas.solutions.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Mixer is a stand-alone Java application.
 *
 * Mixer accepts any number of command line arguments.
 * If Mixer receives 3 or less arguments, Mixer sorts the arguments
 * using Arrays.sort and prints the resultant sorted array.
 *
 * If Mixer receives more than 3 arguments, Mixer sorts the arguments,
 * counts the frequency of each argument, and prints the arguments
 * and their frequency in sorted order.
 *
 * This version of the Mixer uses Autoboxing.
 * This version of the Mixer uses foreach syntax.
 * This version of the Mixer uses type-safe collections.
 *
 * @author developintelligence llc
 * @version 1.0
 */
public class Mixer {

  public static void main(String[] args) {
    //write Mixer logic here
    switch(args.length) {
      case 0:
    	  System.out.println("Enter some arguments");
        break;
      case 1:
      case 2:
      case 3:
        Arrays.sort(args);
        System.out.println(Arrays.toString(args));
      break;
      default:
        Arrays.sort(args);
        //Map<String, Integer> frequencyMap = getFrequencyMap(args);
        Map<String, Integer> frequencyMap = getFrequencyMap(args);
        System.out.println("getFrequencyMap");
        printFrequencyMap(frequencyMap);

        System.out.println("evenBetterFrequencyMap");
        printFrequencyMap(evenBetterFrequencyMap(args));
      break;
    }
  }

  
  private static Map<String, Integer> getFrequencyMap(String[] args) {
    Map<String,Integer> returnMap = new TreeMap<String, Integer>();
    List<String> list = Arrays.asList(args);

    //converted to for-each syntax
    for(String arg : list) {
      if(!returnMap.containsKey(arg)) {
        //This is not good.  We go through the entire collection
        //again for *each* element in the collection.  O(n squared).
        int freq = Collections.frequency(list, arg);
        //converted to use auto-boxing
        returnMap.put(arg, freq);
      }
    }

    return returnMap;
  }

  /**
   * Here we just go through the input array once.
   * @param args
   * @return
   */
  private static Map<String, Integer> betterGetFrequencyMap(String[] args) {
    Map<String,Integer> returnMap = new TreeMap<String, Integer>();
    for(String key : args) {
    	if(!returnMap.containsKey(key)) {
    		returnMap.put(key, 0);
    	}
    	
    	int oldValue = returnMap.get(key);
    	returnMap.put(key, ++oldValue);
    }

    return returnMap;
  }

  /**
   * Here we use computeIfAbsent to initialize a value in the
   * map if necessary, instead of the 'if' test used above.
   * @param args
   * @return
   */
  private static Map<String, Integer> evenBetterFrequencyMap(String[] args) {
    Map<String,Integer> returnMap = new TreeMap<String, Integer>();
    for(String key : args) {

      //Gives you old value or New value of 0
      int oldValue = returnMap.computeIfAbsent(key, (k -> 0));

      returnMap.put(key, ++oldValue);
    }

    return returnMap;
  }


  private static void printFrequencyMap(Map<String, Integer> frequencyMap) {
    Iterator<String> keys = frequencyMap.keySet().iterator();
    while(keys.hasNext()) {
      String key = keys.next();
      //converted to use auto-unboxing
      int value = frequencyMap.get(key);
      System.out.println(key + "=" + value);
    }
  }
}
