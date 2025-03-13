package Exercicios.OOP11.dominio;

public class Pessoa {
    private String nome;
    private String profissao;
    private int idade;

    public Pessoa(String nome, String profissao, int idade) {
        this.nome = nome;
        this.profissao = profissao;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int calcularAnosBissextos() {
        int anosBissextos = idade / 4;
        return anosBissextos;
    }

    public void imprime() {
        System.out.println(nome + " trabalha como " + profissao + " tem " + idade + " anos de idade, e já viveu por " + calcularAnosBissextos() + " anos bissextos.");
    }
}
