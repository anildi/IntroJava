package org.ttl.javafundas.shape.abstraction;

import org.junit.jupiter.api.Test;

/**
 * @author whynot
 */
public class TestAbstractClasses {

    @Test
    //We have now made shape abstract,
    //so we can't make instances of it.
    //Which is good.  We have also
    //expanded the set of common
    //abstract methods we can call.
    public void testAbstractClass() {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(49, 22, 39, 33, "Green", 2);
        shapes[1] = new Circle(10, 20, 5, "Red", 22);
        shapes[2] = new Circle(50, 70, 55, "Brown", 10);
//        compile Error. Can't make Shapes any more
//        shapes[2] = new Shape(50, 70, "Brown", 10);
        for(int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
            System.out.println("Area: " + shapes[i].getArea() + ", per: " + shapes[i].getPerimeter());
        }

    }
}
