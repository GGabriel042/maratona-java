package Exercicios.OOPInterface01.dominio;

public class Triangle implements Shape{
    protected double lado1;
    protected double lado2;
    protected double lado3;
    protected double area;
    protected double semiperi;

    public Triangle(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double getArea() {
        semiperi = (lado1 + lado2 + lado3) /2;
        area = Math.sqrt(semiperi*(semiperi - lado1) * (semiperi - lado2) - (semiperi - lado3));
        return area;
    }
}
