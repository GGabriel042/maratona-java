package Exercicios.OOP10.test;

import Exercicios.OOP10.dominio.Livro;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Game of Thrones", "George RR Martin", 10000);
        Livro livro2 = new Livro("Senhor dos aneis", "JRR Tolkein", 5000);
        Livro livro3 = new Livro("One piece", "Oda", 100000);

        livro1.verificarSeEstaDisponivel();
        livro2.verificarSeEstaDisponivel();
        livro3.verificarSeEstaDisponivel();

        livro1.emprestarLivro();
        livro2.emprestarLivro();
        livro3.emprestarLivro();

        livro2.devolverLivro();

        System.out.println("------------------");

        livro1.verificarSeEstaDisponivel();
        livro2.verificarSeEstaDisponivel();
        livro3.verificarSeEstaDisponivel();
    }
}
