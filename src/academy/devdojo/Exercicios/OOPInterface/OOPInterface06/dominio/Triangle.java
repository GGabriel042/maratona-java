package Exercicios.OOPInterface06.dominio;

import javax.swing.*;
import java.awt.*;

public class Triangle implements Drawable{
    @Override
    public void draw() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);


        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.GREEN);
                int[] xPoints = {
                        200,
                        100,
                        300
                };
                int[] yPoints = {
                        100,
                        300,
                        300
                };
                g.fillPolygon(xPoints, yPoints, 3);
            }
        };
        frame.add(panel);
    }
}
