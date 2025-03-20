package Exercicios.OOP07.test;

import Exercicios.OOP07.dominio.Triangulo;

public class TrianguloTest {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(new int[]{10, 9, 5});
        Triangulo triangulo2 = new Triangulo(new int[]{9, 10, 5});
        Triangulo triangulo3 = new Triangulo(new int[]{5, 10, 9});
        Triangulo triangulo4 = new Triangulo(new int[]{14, 9, 7});

        triangulo1.verificacaoTriangulo();
        triangulo2.verificacaoTriangulo();
        triangulo3.verificacaoTriangulo();
        triangulo4.verificacaoTriangulo();

        System.out.println(triangulo1.areaTriangulo());
        System.out.println(triangulo2.areaTriangulo());
        System.out.println(triangulo3.areaTriangulo());
        System.out.println(triangulo4.areaTriangulo());
    }
}
