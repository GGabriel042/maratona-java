package Exercicios.OOPInterface06.test;

import Exercicios.OOPInterface06.dominio.Circle;
import Exercicios.OOPInterface06.dominio.Drawable;
import Exercicios.OOPInterface06.dominio.Rectangle;
import Exercicios.OOPInterface06.dominio.Triangle;

public class DrawableTest {
    public static void main(String[] args) {
        Drawable rectangle = new Rectangle();
        Drawable circle = new Circle();
        Drawable triangle = new Triangle();

        rectangle.draw();
        circle.draw();
        triangle.draw();
    }
}
