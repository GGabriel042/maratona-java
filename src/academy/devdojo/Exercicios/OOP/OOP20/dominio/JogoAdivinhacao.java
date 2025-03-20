package Exercicios.OOP20.dominio;

import java.util.Scanner;

public class JogoAdivinhacao {
    private int numeroCerto;
    private Scanner scanner;

    public JogoAdivinhacao() {
        this.numeroCerto = numeroCerto;
        this.scanner = new Scanner(System.in);
    }

    public void comecarJogo() {
        numeroCerto = (int) (Math.random() * 100);
        System.out.println("Um numero de 1 a 100 foi gerado, por favor de seu palpite:");
        palpiteJogador();
    }

    public void palpiteJogador() {
        int palpite = scanner.nextInt();
        if (palpite > numeroCerto) {
            System.out.println("Voce errou o numero, o numero gerado é MENOR tente denovo: ");
            palpiteJogador();
        } else if (palpite < numeroCerto) {
            System.out.println("Voce errou o numero, o numero gerado é MAIOR tente denovo: ");
            palpiteJogador();
        } else {
            System.out.println("Parabens voce acertou o numero");
        }
    }
}
