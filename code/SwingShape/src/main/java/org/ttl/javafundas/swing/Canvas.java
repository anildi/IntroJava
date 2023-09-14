package org.ttl.javafundas.swing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import org.ttl.javafundas.shape.interfaces.Shape;

/**
 * @author whynot
 */
public class Canvas extends JComponent {

    List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;

        for(Shape shape : shapes) {
            shape.draw(g2d);
            System.out.println();
        }
    }
}
