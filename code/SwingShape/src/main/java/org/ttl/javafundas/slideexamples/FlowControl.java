package org.ttl.javafundas.slideexamples;

/**
 * @author whynot
 */
public class FlowControl {

    public int ifDemo() {
        int someValue = 10;
        if(someValue < 100) {
            return someValue * 2;
        }else if(someValue < 500) {
            return someValue * 3;
        }else {
            return someValue * 4;
        }
    }

    public int forLoopDemo() {
        int sum = 0;
        for(int i = 1000; i > 0; i--) {
            sum += i;
        }

        return sum;
    }

    public int whileLoopDemo() {
        int sum = 0, i = 1000;

        while(i > 0) {
            sum += i;

            i--;
        }

        return sum;
    }

    public int doWhileLoopDemo() {
        int sum = 0, i = 1000;

        do {
            sum += i;
            i--;
        } while(i > 0);

        return sum;
    }


    public int switchDemo(int arg) {

        int result = 0;
        switch(arg) {
            //can only test for equality, not
            //greater than, less than etc.
            case 10:
                result = 1;
                //need this break here, else
                //control will drop though to the
                //next case
                break;
            case 100:
                result = 2;
                break;
            //default is optional
            default:
                result = -1;
        }

        return result;
    }
}
