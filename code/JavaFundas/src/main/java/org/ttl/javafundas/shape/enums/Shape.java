package org.ttl.javafundas.shape.enums;

/**
 * @author whynot
 */
public interface Shape {
    int getPosX();

    int getPosY();

    ShapeColor getColor();

    int getLineThickness();

    double getArea();

    double getPerimeter();

    void draw();

    default boolean isAboveOriginX() {
        return getPosX() > 0;
    }
}
