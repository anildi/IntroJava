package ttl.live;

/**
 * @author whynot
 */
public class MethodDemo {

    public static void main(String[] args) {

//        othermethod();
//        int result = add10(25);
//        System.out.println("Result: " + result);

        //callSquareit();
        callMethodWithVarArgs();
    }

    public static void othermethod() {
        System.out.println("In other method");
    }

    public static int add10(int input) {
        int result = input + 10;

        return result;
    }

    public static void callSquareit() {
        int[] iarr = {10, 20, 50};

        int[] resultArr = copyAndSquareit(iarr);

        for (int i : resultArr) {
            System.out.println("i: " + i);
        }

    }

    public static int[] copyAndSquareit(int[] input) {
        int [] resultArr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            resultArr[i] = input[i] * input[i];
        }

       return resultArr;
    }

    public static void callMethodWithVarArgs() {
        methodWithVarArgs(10);
        methodWithVarArgs(10, "one");
        methodWithVarArgs(10, "one", "two", "three");
    }

    public static void methodWithVarArgs(int num, String ...names) {
       int i = num;

       for(String name : names) {
           System.out.println("name: " + name);
       }
    }

    public static void doSomething(int input) {

    }

    public static void doSomething(String input) {

    }
}
