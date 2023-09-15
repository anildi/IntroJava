package ttl.live.shape;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author whynot
 */
public class TestOldAbstractShapeList {

    @Test
    public void testSimpleCircle() {
        OldShape shape1 = new OldShape(10, 10, 20, 20);

        Circle circle1 = new Circle(10, 10, 20, 20);
//        circle1.setX1(10);
//        circle1.setY1(20);
//        circle1.setLineThickness(10);

        System.out.println("circl:x1: " + circle1.getX1());

        circle1.draw();

        double area = circle1.getArea();
        System.out.println("area: " + area);

    }

    @Test
    public void testPolymorphism() {
        OldShape shape1 = new OldShape(10, 10, 20, 20);

        Circle circle1 = new Circle(10, 10, 20, 20);
        AbstractShape shape = circle1;
        circle1.setX1(10);
//        circle1.setY1(20);
//        circle1.setLineThickness(10);


        System.out.println("circl:x1: " + circle1.getX1());

        circle1.draw();

        double area = circle1.getArea();
        System.out.println("area: " + area);

    }

    @Test
    public void testInheritanceArrays() {
        Shape[] shapes = new Shape[3];

        Circle circle1 = new Circle(10, 10, 20, 20);
        shapes[0] = circle1;

        shapes[1] = new Circle(10, 10, 40, 50);

        //shapes[2] = new Rectangle(10, 10, 40, 50);
        shapes[2] = new MyFunkyShape();

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }

        double totArea = 0;
        for (Shape s : shapes) {
            totArea += s.getArea();
        }

    }

    @Test
    public void testInheritanceList() {
        Shape[] shapes = new Shape[3];

        List<Shape> shapeList = new ArrayList<>();
//        List<Shape> shapeList = new LinkedList<>();

        Circle circle1 = new Circle(10, 10, 20, 20);
        shapes[0] = circle1;
        shapeList.add(circle1);

        shapes[1] = new Circle(10, 10, 40, 50);
        shapeList.add(shapes[1]);

        //shapes[2] = new Rectangle(10, 10, 40, 50);
        shapes[2] = new MyFunkyShape();
        shapeList.add(shapes[2]);

        for (int i = 0; i < shapeList.size(); i++) {
//            shapes[i].draw();
            shapeList.get(i).draw();
        }

        double totArea = 0;
//        for(Shape s : shapes) {
        for (Shape s : shapeList) {
            totArea += s.getArea();
        }

    }

}
