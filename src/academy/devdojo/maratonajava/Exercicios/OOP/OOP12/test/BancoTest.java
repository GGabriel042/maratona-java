package Exercicios.OOP12.test;

import Exercicios.OOP12.dominio.Banco;

public class BancoTest {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.cadastrarCliente("Gabriel");
        banco.cadastrarCliente("Rafael");
        banco.conferirContaBancaria("Gabriel");
        System.out.println("-------------------");
        banco.conferirContaBancaria("Rafael");
        System.out.println("-------------------");
        banco.deposito("Gabriel", 10000);
        System.out.println("-------------------");
        banco.saque("Gabriel", 500);
        System.out.println("-------------------");
        banco.transferencia("Gabriel", "Rafael", 5000);
        System.out.println("-------------------");
        banco.transferencia("Gabriel", "Rafael", 5000);

    }
}
