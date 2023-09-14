package org.ttl.javafundas.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import org.ttl.javafundas.shape.interfaces.Circle;
import org.ttl.javafundas.shape.interfaces.Rectangle;
import org.ttl.javafundas.shape.interfaces.Triangle;

/**
 * @author whynot
 */
public class ShapeApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();

        Circle circle = new Circle(20, 20, 50);
        canvas.addShape(circle);

        Rectangle rect = new Rectangle(100, 100, 50, 75, Color.red, 20);
        canvas.addShape(rect);

        Triangle triangle  = new Triangle(0, 50, 50, 50, 25, 25, Color.DARK_GRAY, 10);
        canvas.addShape(triangle);

        Triangle triangle2  = new Triangle(70, 200, 50, 50, 25, 25, Color.PINK, 10);
        canvas.addShape(triangle2);

        frame.add(canvas, BorderLayout.CENTER);

        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}
