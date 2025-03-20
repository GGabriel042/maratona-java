package Exercicios.OOP08.test;

import Exercicios.OOP08.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("x", "tesla", 100);
        Carro carro2 = new Carro("gt 500", "mustang", 150);
        Carro carro3 = new Carro("fusca", "wolksvagem", 300);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

        carro1.acelerar(50);
        carro2.frear(25);
        carro3.acelerar(150);

        System.out.println("---------------");

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
