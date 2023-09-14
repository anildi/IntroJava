package org.ttl.javafundas.shape.interfaces;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 * @author whynot
 */
public class Triangle extends AbstractShape {

    private final double length1, length2, length3;
    private final double area;
    private final double perimeter;
    private final int x1, y1, x2, y2, x3, y3;


    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, Color color, int lineThickness) {
//        posX and posY will be the minimum x and minimum y
        super(Math.min(x1, Math.min(x2, x3)), Math.min(y1, Math.min(y2, y3)), color, lineThickness);

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

        length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        length2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        length3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        perimeter = length1 + length2 + length3;

        //From https://www.omnicalculator.com/math/triangle-height#how-to-find-the-height-of-a-triangle-formulas
        //Hanson's formula (who knew??): area = 0.25 * √((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c))
        //We don't really need it here but here's height.
        //height = 0.5 * √((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c)) / b
        area = 0.25 * Math.sqrt((length1 + length2 + length3) * (-length1 + length2 + length3)
                        * (length1 - length2 + length3) * (length1 + length2 - length3));

    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this(x1, y1, x2, y2, x3, y3, Color.CYAN, 10);
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color=" + color +
                ", lineThickness=" + lineThickness +
                ", posX=" + posX +
                ", posY=" + posY +
                ", length1=" + length1 +
                ", length2=" + length2 +
                ", length3=" + length3 +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", x3=" + x3 +
                ", y3=" + y3 +
                '}';
    }

    public void draw(Graphics2D g2d) {
        super.draw(g2d);
//        g2d.setRenderingHints(renderingHints);

        Color oldColor = g2d.getColor();
        Stroke oldStroke = g2d.getStroke();

        Stroke stroke = new BasicStroke(lineThickness);
//        Stroke stroke = new BasicStroke(lineThickness, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL);

        g2d.setStroke(stroke);

        g2d.setColor(color);

        g2d.drawLine(x1, y1, x2, y2);
        g2d.drawLine(x2, y2, x3, y3);
        g2d.drawLine(x3, y3, x1, y1);

        g2d.setColor(oldColor);
        g2d.setStroke(oldStroke);
    }
}