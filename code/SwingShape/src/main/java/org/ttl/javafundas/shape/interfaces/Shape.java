package org.ttl.javafundas.shape.interfaces;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * @author whynot
 */
public interface Shape {
    int getPosX();

    int getPosY();

    Color getColor();

    int getLineThickness();

    double getArea();

    double getPerimeter();

    void draw(Graphics2D g);

    default boolean isAboveOriginX() {
        return getPosX() > 0;
    }
}
