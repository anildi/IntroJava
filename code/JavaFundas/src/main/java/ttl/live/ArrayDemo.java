package ttl.live;

/**
 * @author whynot
 */
public class ArrayDemo {

    public static void main(String[] args) {
        //simpleArrays();
        multipleRefs();
    }

    public static void simpleArrays() {
        int i = 10;

        int[] iarr;




        iarr = new int[10];

        for(int index = 0; index < iarr.length; index++) {
            iarr[index] = 25;
        }

        for(int index = 0; index < iarr.length; index++) {
            int value = iarr[index];
            System.out.println(value);
        }

        for(int value : iarr) {
            System.out.println(value);
        }
    }

    public static void multipleRefs() {
        int[] iarr = new int[10];

        int[] arr2 = iarr;

        arr2 = new int[20];


        for(int i = 0; i < iarr.length; i++) {
            iarr[i] = 24;
        }

        for(int value : arr2) {
            System.out.println(value);
        }
    }
}
