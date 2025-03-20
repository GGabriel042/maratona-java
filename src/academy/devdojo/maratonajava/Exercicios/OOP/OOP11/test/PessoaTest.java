package Exercicios.OOP11.test;

import Exercicios.OOP11.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Gabriel", "programador", 26);
        Pessoa pessoa2 = new Pessoa("Rafael", "desenhista", 30);
        Pessoa pessoa3 = new Pessoa("Julia", "metalurgica", 24);

        pessoa1.imprime();
        pessoa2.imprime();
        pessoa3.imprime();
    }
}
