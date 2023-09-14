package ttl.live;

/**
 * @author whynot
 */
public class Iteration {

    public static void main(String[] args) {
//        whileLoop();
//        dowhileLoop();
        //forLoop();
        switchDemo();
    }

    public static void whileLoop() {

        int i = 10;
        while(i < 10) {
            System.out.println("do while i: " + i);
            //Lots of code

            i++;
        }
    }

    public static void forLoop() {
        for(int i = 0; i < 10; i++) {
            System.out.println("for i: " + i);
        }
    }

    public static void dowhileLoop() {

        int i = 10;
        do {
            System.out.println("i: " + i);

            i++;
        }while(i < 10);
    }


    public static void switchDemo() {
        int i = 10;

//        if(i == 10) {
//            System.out.println("10");
//        }else if(i == 20) {
//            System.out.println("20");
//        } else {
//            System.out.println("something else");
//        }

        switch(i) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            default:
                System.out.println("something else");
        }
    }
}
