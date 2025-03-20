package Exercicios.OOP13.test;

import Exercicios.OOP13.dominio.LojaVirtual;

public class LojaVirtualTest {
    public static void main(String[] args) {
        LojaVirtual loja = new LojaVirtual();

        loja.cadastrarProdutos("Televisão", 3000);
        loja.cadastrarProdutos("Sofá", 2000);
        loja.cadastrarProdutos("Computador", 5000);
        loja.cadastrarProdutos("Impressora 3d", 10000);
        loja.cadastrarProdutos("Carro", 50000);

        loja.adicionarProdutoCarrinho("Televisão");
        loja.adicionarProdutoCarrinho("Televisão");
        loja.adicionarProdutoCarrinho("Impressora 3d");
//        loja.adicionarProdutoCarrinho("Carro");
//        loja.adicionarProdutoCarrinho("Carro");

        loja.mostrarCarrinho();
        System.out.println("----------------");
        loja.calcularDesconto();
    }
}
