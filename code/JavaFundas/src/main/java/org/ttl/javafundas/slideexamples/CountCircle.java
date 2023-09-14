package org.ttl.javafundas.slideexamples;

/**
 * @author whynot
 */
public class CountCircle {

    private int posX, posY;
    private int radius;
    private static int instancesCreated;

    public CountCircle(int posX, int posY, int radius) {
       this.posX = posX;
       this.posY = posY;
       this.radius = radius;

       instancesCreated++;
    }

    public static int getInstancesCreated() {
        //int x = this.centerX;
        return instancesCreated;
    }

    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }
    public int getRadius() {
        return radius;
    }
    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class CountCircleArrayApp {
    public static void main(String [] args) {
        CountCircle [] carr = new CountCircle[10];
        //int x1 = carr[0].getCenterX();  NullPointerException

        for(int i = 0, x = 10, y = 10; i < carr.length; i++, x+=5, y+=5) {
            carr[i] = new CountCircle(x, y, 2);
        }

        int x1 = carr[0].getPosX();
    }
}

class CountCircleApp {
    public static void main(String [] args) {
        int firstCount = CountCircle.getInstancesCreated();
        CountCircle c = new CountCircle(10, 11, 25);

        int secondCount = CountCircle.getInstancesCreated();
        System.out.println("fc: " + firstCount + ", sc: " + secondCount);
    }
}