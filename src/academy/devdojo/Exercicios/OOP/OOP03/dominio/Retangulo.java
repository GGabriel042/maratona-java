package Exercicios.OOP03.dominio;

public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double calcularPerimetro() {
        double perimetro = (altura * 2) + (largura * 2);
        return perimetro;
    }

    public double calcularArea() {
        double area = altura * largura;
        return area;
    }
}
