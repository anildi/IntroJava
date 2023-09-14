package ttl.live.shape;

/**
 * @author whynot
 */
public class Shape {

    private int x;
    private int y;
    private String color;
    private int lineThickness = 1;

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
