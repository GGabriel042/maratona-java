package Exercicios.OOP03.test;

import Exercicios.OOP03.dominio.Retangulo;

public class RetanguloTest {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10,25);

        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.calcularPerimetro());
    }
}
