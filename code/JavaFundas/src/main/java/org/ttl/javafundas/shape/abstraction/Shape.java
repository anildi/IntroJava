package org.ttl.javafundas.shape.abstraction;

/**
 * @author whynot
 */
abstract public class Shape {

    private String color;
    private int lineThickness;
    private int posX, posY;
    private static int instancesCreated;

    public Shape(int posX, int posY, String color, int lineThickness) {
        this.posX = posX;
        this.posY = posY;

        this.color = color;
        this.lineThickness = lineThickness;

        instancesCreated++;

    }

    public Shape(int posX, int posY, int radius) {
        this(posX, posY, "Black", 2);
    }

    public static int getInstancesCreated() {
        return instancesCreated;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public String getColor() {
        return color;
    }

    public int getLineThickness() {
        return lineThickness;
    }

    abstract public double getArea();
    abstract public double getPerimeter();

    abstract public void draw();
}