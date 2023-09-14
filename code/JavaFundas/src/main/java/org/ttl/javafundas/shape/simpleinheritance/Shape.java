package org.ttl.javafundas.shape.simpleinheritance;

/**
 * @author whynot
 */
public class Shape {

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

//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    public double getPerimeter() {
//        return 2 * Math.PI * radius;
//    }

    public void draw() {
        System.out.println("Drawing Shape with posX,Y: " + posX + ", " + posY);
    }
}