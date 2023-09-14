package ttl.live;

/**
 * @author whynot
 */
public class FirstShot {

    public static void main(String[] args) {
//        System.out.println("Here we go");
//        variableTypes();
        operators();
    }

    /**
     * Function to show variable types.
     */
    public static void variableTypes() {
        /*
        boolean, byte – 1 byte
        char (for character data), short – 2 bytes
         int, float – 4 bytes
        long, double – 8 bytes
         */
        //This comment goes to the end of this line.

        //1 byte
        boolean bool = true; //false
        byte aByte = 127;

        //2 byte
        short shortInt = 32000;
        char aCharacter = 'c';

        System.out.println("shortInt: " + shortInt + ", aCharacter: " + aCharacter);

        //4bytes
        int age = 55;
        float floatTotal = 5678.32F;

        //8Bytes
        long currentTimeMillis = System.currentTimeMillis();
        double orderTotal = 5678.32;

        String custName = "Joe";

    }

    public static void operators() {
        int a = 10;
        int b = 21;

//        int sum = a + b;
//        int diff = a - b;
//
//        int remainder = b % a;

        boolean isEven = (b % 2) == 0;

//        if(isEven) {
        if((b % 2) == 0) {
            System.out.println("b is even");
        }else {
            System.out.println("b is odd");
        }

        //divide
        int div = b / a;
        System.out.println("div: " + div);

    }

    public static void incDecrement() {
        int i = 0;

//        i = i + 1;
//        int j = i;
        int j = ++i;

        int k = i++;
//        i = i + 1;
    }

    public static void compare() {
        int i = 10;

        if (i <= 10) {
            System.out.println("yes");
            i = 20;
        } else if(i > 100) {
            System.out.println("gt 100");
        } else {
            System.out.println("else ");
        }
    }



    public static void compound() {
        int i = 10;

        i++;

        i = i + 27;
        i += 27;
    }

}


//Customer's name
//Customer's balance 23.34
//Number of items in an order  = 23
//Order total.  33.67