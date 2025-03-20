package Exercicios.OOP01.test;

import Exercicios.OOP01.dominio.Circulo;

public class CirculoTest {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(14);


        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());
    }
}
