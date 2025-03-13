package Exercicios.OOP02.test;

import Exercicios.OOP02.dominio.ContaBancaria;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Gabriel", "15268", 5000);

        System.out.println(contaBancaria.getSaldo());

        contaBancaria.deposito(500);
        System.out.println(contaBancaria.getSaldo());
        contaBancaria.saque(600);
        System.out.println(contaBancaria.getSaldo());
    }
}
