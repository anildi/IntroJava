package ttl.live.shape;

/**
 * @author whynot
 */
public class Rectangle extends AbstractShape {


    public Rectangle(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public void draw() {
        System.out.println("In Rectangle::draw, radius: ");
    }

    @Override
    public double getArea() {
        System.out.println("In Shape::getArea");
        int width = this.getX2() - this.getX1();
        int height = this.getY2() - this.getY1();
        return width * height;
    }
}
