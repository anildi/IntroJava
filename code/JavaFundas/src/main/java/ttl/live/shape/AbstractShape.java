package ttl.live.shape;

/**
 * App should allow user to create shapes:
 *  circles
 *  rectangles
 */

/**
 * @author whynot
 */
abstract public class AbstractShape implements Shape {

    //public final static String defaultColor = "Black";
    public final static ShapeColor defaultColor = ShapeColor.Black;
    public final static int defaultLineThickness = 1;

    private static int count;

    public static int getCount() {
        return count;
    }

    private int x1;
    private int y1;
    private int x2;
    private int y2;
//    private String color = defaultColor;
    private ShapeColor color = defaultColor;

    private int lineThickness = defaultLineThickness;

   // public Shape() {}

    public AbstractShape(int x1, int y1, int x2, int y2) {
        this(x1, y1, x2, y2, defaultColor, defaultLineThickness);
//        this.x = x;
//        this.y = y;

//        complicatedStuff();
    }

    public AbstractShape(int x1, int y1, int x2, int y2, ShapeColor color, int lineThickness) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
//        this.lineThickness = lineThickness;
        setLineThickness(lineThickness);

        count++;

        complicatedStuff();
    }

//    public Shape() {}

    public void complicatedStuff() {
        //Do some other complicated calculation.
    }


    @Override
    public int getX1() {
        return x1;
    }

    @Override
    public void setX1(int x1) {
        this.x1 = x1;
    }

    @Override
    public int getY1() {
        return y1;
    }

    @Override
    public void setY1(int y1) {
        this.y1 = y1;
    }

    @Override
    public int getX2() {
        return x2;
    }

    @Override
    public void setX2(int x2) {
        this.x2 = x2;
    }

    @Override
    public int getY2() {
        return y2;
    }

    @Override
    public void setY2(int y2) {
        this.y2 = y2;
    }

    @Override
    public ShapeColor getColor() {
        return color;
    }

    @Override
    public void setColor(ShapeColor color) {
        this.color = color;
    }

    @Override
    public int getLineThickness() {
        return lineThickness;
    }

    @Override
    public void setLineThickness(int lineThickness) {
        if(lineThickness > 0) {
            this.lineThickness = lineThickness;
        }
    }


}
