package ttl.live.shape;

import org.junit.jupiter.api.Test;

/**
 * @author whynot
 */
public class TestReferenceArrays {

    @Test
    public void testArrayOfShapes() {
        OldShape[] shapes = new OldShape[3];

        shapes[0] = new OldShape(10, 10, 20, 20);
        shapes[1] = new OldShape(30, 10, 50, 20);
        shapes[2] = new OldShape(54, 10, 74, 20);

        OldShape[] shapes2 = {
                new OldShape(10, 10, 20, 20),
                new OldShape(30, 10, 50, 20),
                new OldShape(54, 10, 74, 20)
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
