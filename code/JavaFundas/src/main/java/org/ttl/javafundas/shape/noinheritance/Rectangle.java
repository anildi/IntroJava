package org.ttl.javafundas.shape.noinheritance;

/**
 * @author whynot
 */
public class Rectangle {

    private String color;
    private int lineThickness;
    private int posX, posY;
    private int width, height;
    private static int instancesCreated;

    public Rectangle(int posX, int posY, int width, int height, String color, int lineThickness) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;

        this.color = color;
        this.lineThickness = lineThickness;

        instancesCreated++;

    }

    public Rectangle(int posX, int posY, int width, int height) {
        this(posX, posY, width, height, "Black", 2);
    }

    public Rectangle(int posX, int posY, int sideLength) {
        this(posX, posY, sideLength, sideLength, "Black", 2);
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

    public void draw() {
        System.out.println("Drawing Rectangle with posX,Y: " + posX + ", " + posY);
    }

}