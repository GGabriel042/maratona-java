package Exercicios.ErrosExceptions03.test;

import Exercicios.ErrosExceptions03.dominio.InvalidAgeException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidAge {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        try {
            if (idade < 0 || idade > 120){
                throw new InvalidAgeException("Sua idade tem que ser entre 0 e 120");
            }
            System.out.println("Sua idade é "+idade);
        } catch (InvalidAgeException e) {
            System.out.println("Error: "+ e.getMessage());
            e.printStackTrace();
        } finally {
            teclado.close();
        }
    }
}
