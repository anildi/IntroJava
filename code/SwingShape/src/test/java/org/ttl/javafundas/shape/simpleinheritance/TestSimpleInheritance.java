package org.ttl.javafundas.shape.simpleinheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author whynot
 */
public class TestSimpleInheritance {

    @Test
    public void testCircle() {
        Circle c = new Circle(10, 20, 5, "Red", 22);

        assertEquals(22, c.getLineThickness());
        assertEquals(2 * Math.PI * 5, c.getPerimeter(), .01);
    }

    @Test
    public void testRectangle() {
        Rectangle r = new Rectangle(49, 22, 39, 33, "Green", 2);

        assertEquals(2, r.getLineThickness());
        assertEquals(2 * 39 + 2 * 33, r.getPerimeter(), .01);
    }

    @Test
    //Can make a super class Reference point
    //at anything that "is-a" super class,
    //i.e. the super class and any of it's
    //sub classes.
    public void testBothSeparately() {
        Shape r = new Rectangle(49, 22, 39, 33, "Green", 2);
        assertEquals("Green", r.getColor());
        r.draw();

        //
        r = new Circle(10, 20, 5, "Red", 22);
        assertEquals(22, r.getLineThickness());
        r.draw();
    }

    @Test
    //Working with Polymorphic collection.
    //Can add all subtypes into an array of
    //super type references.  But can only
    //call methods of the super class through
    //those references.  Have to down cast if
    //you want to call a specific sub class method.
    public void testBothPolymorphically() {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Rectangle(49, 22, 39, 33, "Green", 2);
        shapes[1] = new Circle(10, 20, 5, "Red", 22);
        shapes[2] = new Circle(50, 70, 15, "Brown", 10);

        for(int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
    }

    @Test
    //Shape is not an Abstract class
    //And so one can instantiate it.
    //But what shape would that object
    //actually have?  How would one draw it?
    public void testCanCreateShapesButWhatAreThey() {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Rectangle(49, 22, 39, 33, "Green", 2);
        shapes[1] = new Circle(10, 20, 5, "Red", 22);
        shapes[2] = new Shape(50, 70, "Brown", 10);

        for(int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
    }
}
