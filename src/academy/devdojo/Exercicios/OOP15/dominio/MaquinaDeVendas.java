package Exercicios.OOP15.dominio;

import java.util.ArrayList;

public class MaquinaDeVendas {
    protected ArrayList<Produto> estoque;

    public MaquinaDeVendas() {
        this.estoque = new ArrayList<>();
    }

    public ArrayList<Produto> getEstoque() {
        return estoque;
    }

    public void setEstoque(ArrayList<Produto> estoque) {
        this.estoque = estoque;
    }

    public void cadastrarProduto(String nome, int valor, int quantidade){
        Produto novoProduto = new Produto(nome, valor, quantidade);

        estoque.add(novoProduto);

        System.out.println("Novo produto cadastrado com sucesso: "+ novoProduto);
    }

    public void mostrarEstoque(){
        if (estoque.isEmpty()){
            System.out.println("Estoque está vazio");
        } else {
            System.out.println("Estoque");
            for (Produto produto : estoque){
                System.out.println(produto);
                if (produto.getQuantidade() <= 0) {
                    System.out.println("O produto "+produto.getNome()+" precisa ser reabastecido");
                }
            }
        }
    }

    public void compraProduto(String nomeProduto, int dinheiroInserido){
        boolean produtoEncontrado = false;

        for (Produto produto: estoque) {
            if (nomeProduto.equals(produto.getNome())) {
                produtoEncontrado = true;

                if (produto.getQuantidade() <= 0) {
                    System.out.println("Produto fora de estoque");
                    System.out.println("------------------");
                    return;
                }

                if (dinheiroInserido >= produto.getValor()) {
                    int troco = dinheiroInserido - produto.getValor();

                    produto.setQuantidade(produto.getQuantidade() - 1);

                    System.out.println("Compra realizada com sucesso!");
                    System.out.println("Produto: " + produto.getNome());
                    System.out.println("Valor: R$" + produto.getValor());
                    System.out.println("Troco: R$" + troco);
                    System.out.println("------------------");
                } else {
                    System.out.println("Dinheiro insuficiente. Faltam R$" + (produto.getValor() - dinheiroInserido));
                    System.out.println("------------------");
                }
                return;
            }
        }
        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado");
            System.out.println("------------------");
        }
    }
}
