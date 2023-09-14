package ttl.labs;

/**
 * @author whynot
 */
public class Lab21 {

    public static void main(String[] args) {
       /*
       Create an array of 10 ints.
●Initialize each element of the array to the square of it’s index

Print out the elements of the array, along with their indices.
        */

        int [] knowValues = {10, 20, 30, 56};

        String [] sarr = {"one", "two", "three"};

        int [] iarr = new int[10];

        for(int i = 0; i < iarr.length; i++) {
            iarr[i] = i * i;
        }

        for(int i = 0; i < iarr.length; i++) {
            System.out.println("iarr[" + i + "] = " + iarr[i]);
        }
    }
}
