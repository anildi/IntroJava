package org.ttl.javafundas.shape.interfaces;

/**
 * @author whynot
 */
abstract public class AbstractShape implements Shape {

    private String color;
    private int lineThickness;
    private int posX, posY;
    private static int instancesCreated;

    public AbstractShape(int posX, int posY, String color, int lineThickness) {
        this.posX = posX;
        this.posY = posY;

        this.color = color;
        this.lineThickness = lineThickness;

        instancesCreated++;

    }

    public AbstractShape(String color, int lineThickness) {
        this(-1, -1, color, lineThickness);
    }

    protected AbstractShape() {}

    public static int getInstancesCreated() {
        return instancesCreated;
    }

    @Override
    public int getPosX() {
        return posX;
    }

    @Override
    public int getPosY() {
        return posY;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getLineThickness() {
        return lineThickness;
    }

}