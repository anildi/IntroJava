package ttl.live.shape;

/**
 * @author whynot
 */
public class Shape {

    private final static String defaultColor = "Black";
    private final static int defaultLineThickness = 1;

    private static int count;

    public static int getCount() {
        return count;
    }

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private String color = defaultColor;
    private int lineThickness = defaultLineThickness;

    public Shape(int x1, int y1, int x2, int y2) {
        this(x1, y1, x2, y2, defaultColor, defaultLineThickness);
//        this.x = x;
//        this.y = y;

//        complicatedStuff();
    }

    public Shape(int x1, int y1, int x2, int y2, String color, int lineThickness) {
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


    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLineThickness() {
        return lineThickness;
    }

    public void setLineThickness(int lineThickness) {
        if(lineThickness > 0) {
            this.lineThickness = lineThickness;
        }
    }


    public void draw() {
        System.out.printf("In Shape::draw, x1: %d, y1: %d, x2: %d, y2: %d\n", x1, y1, x2, y2);
    }

    public double getArea() {
        int width = this.x2 - this.x1;
        int height = this.y2 - this.y1;
        return width * height;
    }
}
