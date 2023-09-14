package ttl.live.shape;

/**
 * @author whynot
 */
public class Shape {

    private final static String defaultColor = "Black";
    private final static int defaultLineThickness = 1;
    private int x;
    private int y;
    private String color = defaultColor;
    private int lineThickness = defaultLineThickness;

    public Shape(int x, int y) {
        this(x, y, defaultColor, defaultLineThickness);
//        this.x = x;
//        this.y = y;

//        complicatedStuff();
    }

    public Shape(int x, int y, String color, int lineThickness) {
        this.x = x;
        this.y = y;
        this.color = color;
//        this.lineThickness = lineThickness;
        setLineThickness(lineThickness);

        complicatedStuff();
    }

//    public Shape() {}

    public void complicatedStuff() {
        //Do some other complicated calculation.
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
}
