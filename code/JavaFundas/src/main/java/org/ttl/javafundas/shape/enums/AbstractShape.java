package org.ttl.javafundas.shape.enums;

/**
 * @author whynot
 */
abstract public class AbstractShape implements Shape {

    private ShapeColor color;
    private int lineThickness;
    private int posX, posY;
    private static int instancesCreated;

    public AbstractShape(int posX, int posY, String color, int lineThickness) {
        this.posX = posX;
        this.posY = posY;

        this.color = ShapeColor.valueOf(color.toUpperCase());
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
    public ShapeColor getColor() {
        return color;
    }

    @Override
    public int getLineThickness() {
        return lineThickness;
    }

    @Override
    public String toString() {
        return "AbstractShape{" +
                "color=" + color +
                ", lineThickness=" + lineThickness +
                ", posX=" + posX +
                ", posY=" + posY +
                '}';
    }
}