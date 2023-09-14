package ttl.labs;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author whynot
 */
public class Lab3 {

    public static int [] createArray(int size, int limit) {
        int [] result = new int[size];
        for(int i = 0; i < result.length; i++) {
           result[i] = ThreadLocalRandom.current().nextInt(limit);
        }
        return result;
    }
}
