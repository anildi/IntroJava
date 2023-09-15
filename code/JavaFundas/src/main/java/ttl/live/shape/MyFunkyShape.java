package ttl.live.shape;

/**
 * @author whynot
 */
public class MyFunkyShape implements Shape{
    @Override
    public int getX1() {
        return 0;
    }

    @Override
    public void setX1(int x1) {

    }

    @Override
    public int getY1() {
        return 0;
    }

    @Override
    public void setY1(int y1) {

    }

    @Override
    public int getX2() {
        return 0;
    }

    @Override
    public void setX2(int x2) {

    }

    @Override
    public int getY2() {
        return 0;
    }

    @Override
    public void setY2(int y2) {

    }

    @Override
    public ShapeColor getColor() {
        return null;
    }

    @Override
    public void setColor(ShapeColor color) {

    }

    @Override
    public int getLineThickness() {
        return 0;
    }

    @Override
    public void setLineThickness(int lineThickness) {

    }

    @Override
    public void draw() {
        System.out.println("In MyFunkyShape::draw");
    }

    @Override
    public double getArea() {
        return 0;
    }
}
