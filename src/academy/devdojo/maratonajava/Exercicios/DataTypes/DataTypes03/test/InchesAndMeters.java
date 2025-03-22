package Exercicios.DataTypes03.test;

import java.util.Locale;
import java.util.Scanner;

public class InchesAndMeters {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        System.out.println("Coloque o tamanho em inches: ");
        double inchesInput = teclado.nextDouble();
        double meters = inchesInput * 0.0254;
        System.out.println("Tamanho em metros é "+meters);

        System.out.println("Coloque o tamanho em metros: ");
        double metersInput = teclado.nextDouble();
        double inches = metersInput * 39.37;
        System.out.println("Tamanho em inches é "+inches);
    }
}
