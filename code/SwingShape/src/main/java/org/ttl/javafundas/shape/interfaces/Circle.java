package org.ttl.javafundas.shape.interfaces;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 * @author whynot
 */
public class Circle extends AbstractShape {

    private int radius;

    public Circle(int posX, int posY, int radius, Color color, int lineThickness) {
        super(posX, posY, color, lineThickness);

        this.radius = radius;

        //instancesCreated++;

    }

    public Circle(int posX, int posY, int radius) {
        this(posX, posY, radius, Color.BLUE, 2);
    }

//    public static int getInstancesCreated() {
//        return instancesCreated;
//    }


    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void draw(Graphics2D g2d) {
        super.draw(g2d);

        Color oldColor = g2d.getColor();
        Stroke oldStroke = g2d.getStroke();

        Stroke stroke = new BasicStroke(lineThickness);
        g2d.setStroke(stroke);
        g2d.setColor(color);

        g2d.drawOval(posX, posY, radius * 2, radius * 2);

        g2d.setColor(oldColor);
        g2d.setStroke(oldStroke);
    }
}