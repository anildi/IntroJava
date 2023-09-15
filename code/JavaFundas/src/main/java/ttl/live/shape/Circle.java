package ttl.live.shape;

/**
 * @author whynot
 */
public class Circle extends AbstractShape {

    private int radius;

    public Circle(int x1, int y1, int x2, int y2) {
//        super(x1, y1, x2, y2);
        this(x1, y1, x2, y2, AbstractShape.defaultColor, AbstractShape.defaultLineThickness);
    }

    public Circle(int x1, int y1, int x2, int y2, ShapeColor color, int lineThickness) {
        super(x1, y1, x2, y2, color, lineThickness);

        radius = (x2 - x1) / 2;
//        this.x = x;
//        this.y = y;

//        complicatedStuff();
    }

    public int getRadius() {
       return radius;
    }

    @Override
    public void draw() {
        System.out.println("In Circle::draw, radius: " + radius);
    }

    @Override
    public double getArea() {
        System.out.println("In Circle::getArea");
        return Math.PI * radius * radius;
    }
}
