package Exercicios.ErrosExceptions01.test;

import java.util.Scanner;

public class TryCatchDivision {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int primeiroNum = teclado.nextInt();

        System.out.println("Digite o segundo numero: ");
        int segundoNum = teclado.nextInt();

        try {
            int resultado = primeiroNum / segundoNum;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
