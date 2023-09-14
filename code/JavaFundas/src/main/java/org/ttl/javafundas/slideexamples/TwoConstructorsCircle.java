package org.ttl.javafundas.slideexamples;

/**
 * @author whynot
 */
public class TwoConstructorsCircle {

    private int centerX, centerY;
    private int radius;

    public TwoConstructorsCircle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    //create a Unit circle
    public TwoConstructorsCircle(int x, int y) {
        //call 3 argument constructor
        this(x, y, 1);
    }

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

class TwoConstructorApp {
    public static void main(String[] args) {
//        ConstructCircle c = new ConstructCircle();
        TwoConstructorsCircle c = new TwoConstructorsCircle(10, 11, 25);
        //c.centerX = 10;

        double area = c.getArea();
        System.out.println("Area: " + area);
    }
}