package ttl.live.shape;

import org.junit.jupiter.api.Test;

/**
 * @author whynot
 */
public class TestInterfaceShape {

    @Test
    public void testInterfaceShape() {

        Shape[]  shapes = new Shape[3];

        Circle circle1 = new Circle(10, 10, 20, 20);
        shapes[0] = circle1;

        shapes[1] = new Circle(10, 10, 40, 50);

        shapes[2] = new Rectangle(10, 10, 40, 50);

        for(int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }

        double totArea = 0;
        for(Shape s : shapes) {
            totArea += s.getArea();
        }
    }
}
