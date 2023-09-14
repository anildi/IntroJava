package org.ttl.javafundas.slideexamples;

/**
 * @author whynot
 */
public enum ColorEnum {
    GREEN,
    RED,
    BLUE,
    BLACK;

    public String toString() {
        String str = name();
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
