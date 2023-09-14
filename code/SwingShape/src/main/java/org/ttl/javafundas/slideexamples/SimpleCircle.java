package org.ttl.javafundas.slideexamples;

/**
 * @author whynot
 */
public class SimpleCircle {
    int centerX, centerY;
    int radius;

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

class SimpleApp {
    void doCircleStuff(int x, int y, int radius) {
        SimpleCircle c = new SimpleCircle();
        c.centerX = x;
        c.centerY = y;
        c.radius = radius;

        double area = c.getArea();
    }
}
