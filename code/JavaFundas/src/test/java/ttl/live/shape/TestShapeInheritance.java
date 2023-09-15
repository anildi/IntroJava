package ttl.live.shape;

import org.junit.jupiter.api.Test;

/**
 * @author whynot
 */
public class TestShapeInheritance {

    @Test
    public void testSimpleCircle() {
        Shape shape1 = new Shape(10, 10, 20, 20);

        Circle circle1 = new Circle(10, 10, 20, 20);
//        circle1.setX1(10);
//        circle1.setY1(20);
//        circle1.setLineThickness(10);

        System.out.println("circl:x1: " + circle1.getX1() );

        circle1.draw();

        double area = circle1.getArea();
        System.out.println("area: " + area);

    }

    @Test
    public void testPolymorphism() {
        Shape shape1 = new Shape(10, 10, 20, 20);

        Circle circle1 = new Circle(10, 10, 20, 20);
        Shape shape = circle1;
        circle1.setX1(10);
//        circle1.setY1(20);
//        circle1.setLineThickness(10);


        System.out.println("circl:x1: " + circle1.getX1() );

        circle1.draw();

        double area = circle1.getArea();
        System.out.println("area: " + area);

    }

    @Test
    public void testInheritanceArrays() {
        Shape[]  shapes = new Shape[3];

        Circle circle1 = new Circle(10, 10, 20, 20);
        shapes[0] = circle1;

        shapes[1] = new Shape(10, 10, 40, 50);

        shapes[2] = new Circle(10, 10, 40, 50);

        for(int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }

        double totArea = 0;
        for(Shape s : shapes) {
            totArea += s.getArea();
        }



    }

}
