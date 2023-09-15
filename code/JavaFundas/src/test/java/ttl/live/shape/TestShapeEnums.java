package ttl.live.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author whynot
 */
public class TestShapeEnums {

    @Test
    public void testEnums() {
        Shape s = new Circle(10, 20, 30, 40, ShapeColor.Red, 2);

        assertEquals(ShapeColor.Red, s.getColor());
    }

    @Test
    public void testEnums2() {
        Shape s = new Circle(10, 20, 30, 40);

        assertEquals(ShapeColor.Black, s.getColor());
    }
}
