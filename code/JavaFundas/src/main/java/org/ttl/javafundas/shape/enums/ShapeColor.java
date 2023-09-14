package org.ttl.javafundas.shape.enums;

/**
 * @author whynot
 */
public enum ShapeColor {
    BLACK,
    GREEN,
    BLUE,
    RED;

    public String toString() {
        String str = name();
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
