package Exercicios.OOP13.dominio;

import java.util.ArrayList;

public class LojaVirtual {
    private ArrayList<String> produtos;
    private ArrayList<Double> valorProdutos;
    private ArrayList<String> carrinho;
    private double valorTotal;

    public LojaVirtual(){
        this.produtos = new ArrayList<>();
        this.valorProdutos = new ArrayList<>();
        this.carrinho = new ArrayList<>();
        this.valorTotal = 0;
    }

    public ArrayList<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<String> produtos) {
        this.produtos = produtos;
    }

    public ArrayList<Double> getValorProdutos() {
        return valorProdutos;
    }

    public void setValorProdutos(ArrayList<Double> valorProdutos) {
        this.valorProdutos = valorProdutos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<String> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<String> carrinho) {
        this.carrinho = carrinho;
    }

    public void cadastrarProdutos(String nome, double valor) {
        produtos.add(nome);
        valorProdutos.add(valor);
    }

    public void adicionarProdutoCarrinho(String nomeProduto) {
        for (int i = 0; i<produtos.size(); i++){
            if (nomeProduto.equals(produtos.get(i))){
                carrinho.add(produtos.get(i));
                valorTotal += valorProdutos.get(i);
            }
        }
    }

    public void mostrarCarrinho(){
        for (int i = 0; i< carrinho.size(); i++) {
            System.out.println("Produto "+(i + 1)+" "+carrinho.get(i)+" adicionado no carrinho, no valor de: R$"+valorProdutos.get(i));
        }
        System.out.println("Valor total: R$"+valorTotal+" do carrinho");
    }

    public void calcularDesconto() {
        if (valorTotal > 15000 && valorTotal < 50000) {
            valorTotal = valorTotal - (valorTotal *  0.10);
        } else if(valorTotal > 50000 && valorTotal < 100000) {
            valorTotal = valorTotal - (valorTotal *  0.25);
        } else if (valorTotal > 100000){
            valorTotal = valorTotal - (valorTotal *  0.50);
        }
        mostrarCarrinho();
    }
}
