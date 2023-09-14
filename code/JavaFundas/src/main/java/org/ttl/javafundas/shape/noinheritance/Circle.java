package org.ttl.javafundas.shape.noinheritance;

import org.ttl.javafundas.slideexamples.CountCircle;

/**
 * @author whynot
 */
public class Circle {

    private String color;
    private int lineThickness;
    private int posX, posY;
    private int radius;
    private static int instancesCreated;

    public Circle(int posX, int posY, int radius, String color, int lineThickness) {
        this.posX = posX;
        this.posY = posY;
        this.radius = radius;

        this.color = color;
        this.lineThickness = lineThickness;

        instancesCreated++;

    }

    public Circle(int posX, int posY, int radius) {
        this(posX, posY, radius, "Black", 2);
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

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void draw() {
        System.out.println("Drawing Circle with posX,Y: " + posX + ", " + posY);
    }
}