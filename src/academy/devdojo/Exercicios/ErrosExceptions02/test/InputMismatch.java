package Exercicios.ErrosExceptions02.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        try {
            System.out.println("Sua idade é " + idade);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
