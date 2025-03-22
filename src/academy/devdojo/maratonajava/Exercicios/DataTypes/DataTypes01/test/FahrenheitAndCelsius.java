package Exercicios.DataTypes01.test;

import java.util.Scanner;

public class FahrenheitAndCelsius {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em fahrenheits: ");
        double fahrenheitInput = teclado.nextDouble();
        double celsius = (5 *(fahrenheitInput - 32)) /9;
        System.out.println("A temperatura em celsius é "+celsius+"°");


        System.out.println("Digite a temperatura em celsius");
        double celsiusInput = teclado.nextDouble();
        double fahrenheit = (9 * celsiusInput +(32 * 5)) /5;
        System.out.println("A temperatura em fahrenheit é "+fahrenheit+"°");
    }
}
