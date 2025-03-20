package Exercicios.DataTypes02.test;

import java.util.Scanner;

public class SumInteger {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os numeros de 0 a 1000: ");
        int numero = teclado.nextInt();
        int numeroFinal = 0;
        while (numero > 0){
            numeroFinal += numero % 10;
            numero /= 10;
        }
        System.out.println(numeroFinal);
    }
}
