package Exercicios.OOP06.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularValorTotal(){
        double valorTotal = getPreco() * getQuantidade();
        return valorTotal;
    }

    public void verificacaoProdutoEstoque(){
        if (quantidade < 0) {
            System.out.println("Produto não está disponível no momento");
        } else {
            System.out.println("Existem " + quantidade + " do produto " + nome + " em estoque");
        }
    }
}
