package ttl.labs;

/**
 * @author whynot
 */
public class Lab2 {

    /*
    Write a program that goes in a loop from -500 to +500 and
prints out all numbers that are divisible by either 3 or 7. Do
this with a for loop and a while loop
     */

    public static void main(String[] args) {
//        whileLoop();
        forLoop();
    }

    public static void forLoop() {
        for(int current = -500; current < 500; current++) {
            if(current % 3 == 0) {
                System.out.println(current + ", is divisible by 3");
            }
            if(current % 7 == 0) {
                System.out.println(current + ", is divisible by 7");
            }
        }
    }
    public static void whileLoop() {
        //while loop
        int current = -500;
        while(current < 500) {
            if(current % 3 == 0) {
                System.out.println(current + ", is divisible by 3");
            }
            if(current % 7 == 0) {
                System.out.println(current + ", is divisible by 7");
            }
            current++;
        }
    }
}
