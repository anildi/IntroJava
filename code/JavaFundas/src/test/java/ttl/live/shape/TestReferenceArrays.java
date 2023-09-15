package ttl.live.shape;

import org.junit.jupiter.api.Test;

/**
 * @author whynot
 */
public class TestReferenceArrays {

    @Test
    public void testArrayOfShapes() {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Shape(10, 10, 20, 20);
        shapes[1] = new Shape(30, 10, 50, 20);
        shapes[2] = new Shape(54, 10, 74, 20);

        Shape[] shapes2 = {
                new Shape(10, 10, 20, 20),
                new Shape(30, 10, 50, 20),
                new Shape(54, 10, 74, 20)
        };

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("shape.x1: " + shapes[i].getX1());
        }
    }

    @Test
    public void testReferenceEquality() {
        String s1 = "hello";
        String s2 = new String("hello");

        //Do NOT use == for testing object value equality.
        //Use .equals instead.
        //if(s1 == s2) {  //BAD.  DO NOT DO THIS.
        if(s1.equals(s2)) {  //Do this instead.
            System.out.println("Equals");
        } else {
            System.out.println("NOT Equals");
        }
    }
}
