package Exercicios.OOPInterface01.dominio;
import static java.lang.Math.*;

public class Circle implements Shape {
    protected double raio;
    protected double area;

    public Circle(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        area = PI*(pow(raio, 2));
        return area;
    }
}
