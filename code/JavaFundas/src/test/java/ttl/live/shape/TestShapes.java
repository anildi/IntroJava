package ttl.live.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author whynot
 */
public class TestShapes {

    @Test
    public void testBasicShape() {
        Shape shape1 = new Shape();
        shape1.setX(10);
        shape1.setY(10);
        shape1.setColor("Red");
        shape1.setLineThickness(-100);

        assertEquals(10, shape1.getX());
        assertEquals(1, shape1.getLineThickness());
    }
}
