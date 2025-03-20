package Exercicios.OOPInterface05.test;

import Exercicios.OOPInterface05.dominio.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(15,20 );
        rectangle.showSize();
        rectangle.resizeWidth(20);
        rectangle.resizeHeight(30);
        rectangle.showSize();
    }
}
