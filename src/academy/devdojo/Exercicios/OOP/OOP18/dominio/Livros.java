package Exercicios.OOP18.dominio;

public class Livros {
    private String nome;
    private boolean livroDisponivel;
    private int tempoEmprestado;

    public Livros(String nome, boolean livroDisponivel) {
        this.nome = nome;
        this.livroDisponivel = livroDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLivroDisponivel() {
        return livroDisponivel;
    }

    public void setLivroDisponivel(boolean livroDisponivel) {
        this.livroDisponivel = livroDisponivel;
    }

    public int getTempoEmprestado() {
        return tempoEmprestado;
    }

    public void setTempoEmprestado(int tempoEmprestado) {
        this.tempoEmprestado = tempoEmprestado;
    }
}
