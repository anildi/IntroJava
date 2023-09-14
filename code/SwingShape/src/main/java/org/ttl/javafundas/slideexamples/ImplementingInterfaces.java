package org.ttl.javafundas.slideexamples;

import org.ttl.javafundas.shape.interfaces.Circle;
import org.ttl.javafundas.shape.interfaces.Shape;

/**
 * 3 ways to implement an Interface in Java
 * @author whynot
 */
interface Checker {
    public boolean check(Shape shape);
}

/**
 * As a full fledged class
 */
class FullClassAreaChecker implements Checker {
    @Override
    public boolean check(Shape shape) {
        return shape.getArea() > 100;
    }
}


class InterfaceApp {
    public static void main(String [] args) {

        Circle circle = new Circle(20, 20, 20);
        //Use the full class implementation
        Checker fullChecker = new FullClassAreaChecker();
        boolean r1 = fullChecker.check(circle);
        System.out.println("Circle1 area > 100: " + r1);

        //Use Lambda
        Checker anonymousChecker = new Checker() {
            @Override
            public boolean check(Shape shape) {
                return shape.getArea() > 100;
            }
        };

        boolean r2 = anonymousChecker.check(circle);
        System.out.println("Circle2 area > 100: " + r2);

        //Use lambda.  Lambda gives you the most concise
        //syntax.  Most useful for small implementations
        //Basic syntax is
        // (arg1, ...) -> { code; }

        Checker lambdaChecker = (Shape s) -> { return s.getArea() > 100; };
        Checker lambdaChecker2 = (s) -> s.getArea() > 100;

        boolean r3 = lambdaChecker.check(circle);
        System.out.println("Circle3 area > 100: " + r3);
    }
}