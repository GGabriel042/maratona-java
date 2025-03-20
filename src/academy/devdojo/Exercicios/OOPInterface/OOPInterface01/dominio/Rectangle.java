package Exercicios.OOPInterface01.dominio;

public class Rectangle implements Shape {
    protected double largura;
    protected double altura;
    protected double area;

    public Rectangle(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        area = altura * largura;
        return area;
    }
}
