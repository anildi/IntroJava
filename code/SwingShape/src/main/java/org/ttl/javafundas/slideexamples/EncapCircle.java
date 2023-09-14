package org.ttl.javafundas.slideexamples;

/**
 * @author whynot
 */
public class EncapCircle {

    private int centerX, centerY;
    private int radius;

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class EncapApp {
    public static void main(String [] args) {
        EncapCircle c = new EncapCircle();
        //c.centerX = 10;
        c.setCenterX(10);
        c.setCenterY(11);
        c.setRadius(25);

        double area = c.getArea();
        System.out.println("Area: " + area);
    }
}