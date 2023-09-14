package org.ttl.javafundas.slideexamples;

/**
 * @author whynot
 */
public class ConstructCircle {

    private int centerX, centerY;
    private int radius;

    public ConstructCircle(int x, int y, int r) {
       centerX = x;
       centerY = y;
       radius = r;
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

class ConstructApp {
    public static void main(String [] args) {
//        ConstructCircle c = new ConstructCircle();
        ConstructCircle c = new ConstructCircle(10, 11, 25);
        //c.centerX = 10;

        double area = c.getArea();
        System.out.println("Area: " + area);
    }
}