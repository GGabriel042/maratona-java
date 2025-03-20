package Exercicios.OOP18.test;

import Exercicios.OOP18.dominio.Biblioteca;

public class BibliotecaTest {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.cadastrarLivro("Game of thrones");
        biblioteca.cadastrarLivro("Lord of the rings");
        biblioteca.cadastrarLivro("Game of thrones");

        biblioteca.pegarLivroEmprestado("Game of thrones");
        biblioteca.pegarLivroEmprestado("Rainha má");
        biblioteca.pegarLivroEmprestado("Game of thrones");


        biblioteca.retornarLivro("Game of thrones");
        biblioteca.retornarLivro("Lord of the rings");


        biblioteca.retornarLivro("Rainha má");
        biblioteca.retornarLivro("Rainha boa");
    }
}
