package Exercicios.OOP06.test;

import Exercicios.OOP06.dominio.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("geladeira", 2500.99, 50);
        Produto produto2 = new Produto("televisão", 2000, 10);
        Produto produto3 = new Produto("fogão", 1500, 100);
        Produto produto4 = new Produto("computador", 7000.99, 0);

        System.out.println(produto1.calcularValorTotal());
        System.out.println(produto2.calcularValorTotal());
        System.out.println(produto3.calcularValorTotal());
        System.out.println(produto4.calcularValorTotal());

        produto1.verificacaoProdutoEstoque();
        produto2.verificacaoProdutoEstoque();
        produto3.verificacaoProdutoEstoque();
        produto4.verificacaoProdutoEstoque();
    }
}
