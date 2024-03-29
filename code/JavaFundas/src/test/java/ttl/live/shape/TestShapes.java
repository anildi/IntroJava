package ttl.live.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author whynot
 */
public class TestShapes {

    @Test
    public void testBasicShape() {
        OldShape shape1 = new OldShape(10, 10, 20, 20, "Red", -100);
//        shape1.setX(10);
////        shape1.setY(10);
//        shape1.setColor("Red");
//        shape1.setLineThickness(-100);

        assertEquals(10, shape1.getX1());
        assertEquals(1, shape1.getLineThickness());
    }

    @Test
    public void testShapeConstructors() {
        OldShape shape1 = new OldShape(10, 10, 20, 20, "Red", -100);

        OldShape shape2 = new OldShape(10, 10, 20, 20 );
//        shape1.setX(10);
////        shape1.setY(10);
//        shape1.setColor("Red");
//        shape1.setLineThickness(-100);

        assertEquals(10, shape2.getX1());
        assertEquals(1, shape2.getLineThickness());
        assertEquals("Black", shape2.getColor());
    }


    @Test
    public void testBehaviours() {
        OldShape shape1 = new OldShape(10, 10, 20, 20);

        OldShape shape2 = new OldShape(40, 40, 60, 60);


        double area = shape1.getArea();

        double area2 = shape2.getArea();

        System.out.println("area: " + area);
        assertEquals(100.0, area);
    }

    @Test
    public void testCountInstances() {

        int count = OldShape.getCount();
        System.out.println("first count: " + count);

        OldShape shape1 = new OldShape(10, 10, 20, 20);

        OldShape shape2 = new OldShape(40, 40, 60, 60);

        count = OldShape.getCount();

        System.out.println("count: " + count);

        assertEquals(2, count);
    }

    @Test
    public void testMath() {
        double result = Math.pow(3, 5);
        System.out.println("result: " + result);
    }
}
