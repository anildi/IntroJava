package ttl.live.shape;

/**
 * @author whynot
 */
public interface Shape {
    int getX1();

    void setX1(int x1);

    int getY1();

    void setY1(int y1);

    int getX2();

    void setX2(int x2);

    int getY2();

    void setY2(int y2);

    ShapeColor getColor();

    void setColor(ShapeColor color);

    int getLineThickness();

    void setLineThickness(int lineThickness);

    void draw();

    double getArea();
}
