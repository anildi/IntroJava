package ttl.live.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author whynot
 */
public class TestShapes {

    @Test
    public void testBasicShape() {
        Shape shape1 = new Shape(10, 10, "Red", -100);
//        shape1.setX(10);
////        shape1.setY(10);
//        shape1.setColor("Red");
//        shape1.setLineThickness(-100);

        assertEquals(10, shape1.getX());
        assertEquals(1, shape1.getLineThickness());
    }

    @Test
    public void testShapeConstructors() {
        Shape shape1 = new Shape(10, 10, "Red", -100);

        Shape shape2 = new Shape(10, 10);
//        shape1.setX(10);
////        shape1.setY(10);
//        shape1.setColor("Red");
//        shape1.setLineThickness(-100);

        assertEquals(10, shape2.getX());
        assertEquals(1, shape2.getLineThickness());
        assertEquals("Black", shape2.getColor());
    }
}
