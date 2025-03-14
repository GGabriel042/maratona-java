package Exercicios.OOPInterface01.test;

import Exercicios.OOPInterface01.dominio.Circle;
import Exercicios.OOPInterface01.dominio.Rectangle;
import Exercicios.OOPInterface01.dominio.Triangle;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(15,50);
        Circle circle = new Circle(15);
        Triangle triangle = new Triangle(15, 12, 16);

        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());
        System.out.println(triangle.getArea());
    }
}
