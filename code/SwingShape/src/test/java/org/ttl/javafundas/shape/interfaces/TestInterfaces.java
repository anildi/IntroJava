package org.ttl.javafundas.shape.interfaces;

import java.awt.Color;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author whynot
 */
public class TestInterfaces {
    @Test
    public void testAbstractClass() {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(49, 22, 39, 33, Color.GREEN, 2);
        shapes[1] = new Circle(10, 20, 5, Color.RED, 22);
        shapes[2] = new Triangle(50, 70, 55, 60, 10, 5, Color.PINK, 10);
//        compile Error. Can't make Shapes any more
//        shapes[2] = new Shape(50, 70, "Brown", 10);
        for(int i = 0; i < shapes.length; i++) {
//            shapes[i].draw();
            System.out.println("Area: " + shapes[i].getArea() + ", per: " + shapes[i].getPerimeter());
        }
    }

    @Test
    public void testTriangleAreaPerimeter() {
        Triangle t  = new Triangle(0, 0, 50, 0, 25, 25, Color.PINK, 10);
        double l1 = 50;
        //pythagoras magic
        double l2 = Math.sqrt(Math.pow(25, 2) + Math.pow(25,2));
        double l3 = Math.sqrt(Math.pow(25, 2) + Math.pow(25,2));

        double expectedPerimeter = l1 + l2 + l3;
        double expectedArea = .5 * l1 * 25;

        System.out.println("Area: " + t.getArea() + ", per: " + t.getPerimeter());

        assertEquals(expectedPerimeter, t.getPerimeter(), .02);
        assertEquals(expectedArea, t.getArea(), .02);
    }
}
