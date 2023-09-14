package org.ttl.javafundas.shape.enums;


/**
 * @author whynot
 */
public class Triangle extends AbstractShape {

    private String color;
    private int lineThickness;
    private double length1, length2, length3;
    private double area;
    private double perimeter;


    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, String color, int lineThickness) {
        //here we can't directly call super, since we need to calculate stuff
        //super(posX, posY, color, lineThickness);
        length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        length2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        length3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        perimeter = length1 + length2 + length3;

        //From https://www.omnicalculator.com/math/triangle-height#how-to-find-the-height-of-a-triangle-formulas
        //Hanson's formula (who knew??): area = 0.25 * √((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c))
        //We don't really need it here but here's height.
        //height = 0.5 * √((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c)) / b
        area = 0.25 * Math.sqrt((length1 + length2 + length3) * (-length1 + length2 + length3)
                        * (length1 - length2 + length3) * (length1 + length2 - length3));

        //instancesCreated++;

    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this(x1, y1, x2, y2, x3, y3, "Blue", 10);
    }
//    public static int getInstancesCreated() {
//        return instancesCreated;
//    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void draw() {
        System.out.println("Drawing Triangle with posX,Y: " + getPosX() + ", " + getPosY());
    }
}