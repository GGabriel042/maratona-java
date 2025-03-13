package Exercicios.OOP15.test;

import Exercicios.OOP15.dominio.MaquinaDeVendas;

public class MaquinaDeVendasTest {
    public static void main(String[] args) {
        MaquinaDeVendas maquinaDeVendas = new MaquinaDeVendas();

        maquinaDeVendas.mostrarEstoque();
        System.out.println("-----------------");

        maquinaDeVendas.cadastrarProduto("Refrigerante", 5, 10);
        maquinaDeVendas.cadastrarProduto("Chocolate", 3, 10);
        maquinaDeVendas.cadastrarProduto("Salgadinho", 4, 1);
        System.out.println("-----------------");

        maquinaDeVendas.mostrarEstoque();
        System.out.println("-----------------");

        maquinaDeVendas.compraProduto("Refrigerante", 15);
        maquinaDeVendas.compraProduto("Salgadinho", 10);
        maquinaDeVendas.compraProduto("Salgadinho", 6);
        maquinaDeVendas.compraProduto("Chocolate", 6);
        maquinaDeVendas.compraProduto("Refrigerante", 3);
        System.out.println("-----------------");

        maquinaDeVendas.mostrarEstoque();
    }
}
