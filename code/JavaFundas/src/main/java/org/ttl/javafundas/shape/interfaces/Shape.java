package org.ttl.javafundas.shape.interfaces;

/**
 * @author whynot
 */
public interface Shape {
    int getPosX();

    int getPosY();

    String getColor();

    int getLineThickness();

    double getArea();

    double getPerimeter();

    void draw();

    default boolean isAboveOriginX() {
        return getPosX() > 0;
    }
}
