package Exercicios.OOPInterface06.dominio;

import javax.swing.*;
import java.awt.*;

public class Rectangle implements Drawable{
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
                g.setColor(Color.BLUE);
                g.fillRect(100, 100, 200, 200);
            }
        };
        frame.add(panel);
    }
}
