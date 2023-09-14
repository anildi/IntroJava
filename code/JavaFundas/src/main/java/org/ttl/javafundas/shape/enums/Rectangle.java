package org.ttl.javafundas.shape.enums;

/**
 * @author whynot
 */
public class Rectangle extends AbstractShape {

    private int width, height;
    private static int instancesCreated;

    public Rectangle(int posX, int posY, int width, int height, String color, int lineThickness) {
        super(posX, posY, color, lineThickness);
        this.width = width;
        this.height = height;

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
        System.out.println("Drawing Rectangle with posX,Y: " + getPosX() + ", " + getPosY());
    }

}