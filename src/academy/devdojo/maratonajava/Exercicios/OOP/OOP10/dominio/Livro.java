package Exercicios.OOP10.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private boolean estaDisponivel = true;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void emprestarLivro() {
        if (!estaDisponivel) {
            return;
        } else
            estaDisponivel = false;
    }

    public void devolverLivro() {
        if (!estaDisponivel) {
            estaDisponivel = true;
        } else return;
    }

    public void verificarSeEstaDisponivel() {
        if (estaDisponivel){
            System.out.println("O livro "+ titulo +" está disponível");
        } else {
            System.out.println("O livro "+ titulo +" não está disponível");
        }
    }
}
