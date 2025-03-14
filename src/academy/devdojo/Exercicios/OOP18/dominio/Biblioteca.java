package Exercicios.OOP18.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    protected List<Livros> estanteLivros;
    private Scanner scanner;
    final String pularLinha = "-------------------";

    public Biblioteca() {
        this.estanteLivros = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void cadastrarLivro(String nome) {
        for (Livros livro : estanteLivros) {
            if (nome.equals(livro.getNome())) {
                System.out.println("O livro " + nome + " já foi cadastrado");
                System.out.println(pularLinha);
                return;
            }
        }
        Livros novoLivro = new Livros(nome, true);
        estanteLivros.add(novoLivro);
        System.out.println("O livro: " + nome + " foi cadastrado com sucesso.");
        System.out.println(pularLinha);
    }

    public void pegarLivroEmprestado(String nome) {
        for (Livros livro : estanteLivros) {
            if (nome.equals(livro.getNome())) {
                if (livro.isLivroDisponivel()) {
                    System.out.println("O livro " + nome + " está disponivel para emprestimo");
                    System.out.println("Por quantos dias voce gostaria de levar o livro " + nome + "?");
                    livro.setTempoEmprestado(scanner.nextInt());
                    System.out.println(pularLinha);
                    livro.setLivroDisponivel(false);
                    return;
                } else {
                    System.out.println("O livro " + nome + " já está emprestado");
                    System.out.println("Voce poderá pegar o livro " + nome + " daqui a " + livro.getTempoEmprestado() + " dias");
                    System.out.println(pularLinha);
                    return;
                }
            } else {
                System.out.println("O livro " + nome + " não foi encontrado no nosso sistema");
                System.out.println(pularLinha);
                return;
            }
        }
    }

    public void retornarLivro(String nome) {
        for (Livros livro : estanteLivros) {
            if (nome.equals(livro.getNome())) {
                if (!livro.isLivroDisponivel()) {
                    System.out.println("Obrigado por devolver o livro " + nome);
                    System.out.println(pularLinha);
                    livro.setLivroDisponivel(true);
                    return;
                } else {
                    System.out.println("Nós já temos o livro " + nome + " aqui, então o seu provavelmente foi emprestado por outra biblioteca");
                    System.out.println(pularLinha);
                    return;
                }
            }
        }
        System.out.println("O livro " + nome + " não é nosso, não temos ele aqui");
        System.out.println("Gostaria de cadastra-lo para que outros possam ler?");
        String receberLivroNovo = scanner.next();
        if (receberLivroNovo.equals("Sim")) {
            cadastrarLivro(nome);
            System.out.println("Obrigado por cadastrar o livro");
            System.out.println(pularLinha);

        } else if (receberLivroNovo.equals("Não")) {
            System.out.println("Obrigado, tenha um bom dia");
            System.out.println(pularLinha);
        }
    }
}
