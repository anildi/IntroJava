package org.ttl.javafundas.shape.interfaces;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 * @author whynot
 */
public class Rectangle extends AbstractShape {

    private int width, height;
    private static int instancesCreated;

    public Rectangle(int posX, int posY, int width, int height, Color color, int lineThickness) {
        super(posX, posY, color, lineThickness);
        this.width = width;
        this.height = height;

        instancesCreated++;

    }

    public Rectangle(int posX, int posY, int width, int height) {
        this(posX, posY, width, height, Color.BLACK, 2);
    }

    public Rectangle(int posX, int posY, int sideLength) {
        this(posX, posY, sideLength, sideLength, Color.BLACK, 2);
    }

    public static int getInstancesCreated() {
        return instancesCreated;
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public boolean isSquare() {
        return width == height;
    }

    public void draw(Graphics2D g2d) {
        super.draw(g2d);
//        g2d.setRenderingHints(renderingHints);

        Color oldColor = g2d.getColor();
        Stroke oldStroke = g2d.getStroke();

        Stroke stroke = new BasicStroke(lineThickness);
        g2d.setStroke(stroke);
        g2d.setColor(color);

        g2d.drawRect(posX, posY, width, height);

        g2d.setColor(oldColor);
        g2d.setStroke(oldStroke);
    }

}