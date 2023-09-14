package org.ttl.javafundas.slideexamples;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import org.ttl.javafundas.shape.enums.ShapeColor;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author whynot
 */
public class TestColorEnum {

    @Test
    public void testColorEnumsToString() {
        ColorEnum color = ColorEnum.GREEN;

        String str = color.toString();
        System.out.println("Str: " + str);

        assertEquals("Green", str);
    }

    @Test
    public void testColorEnumsValueOf() {
        String strColor = "Green";

        ColorEnum color = ColorEnum.valueOf(strColor.toUpperCase());

        assertEquals(ColorEnum.GREEN, color);
    }
}
