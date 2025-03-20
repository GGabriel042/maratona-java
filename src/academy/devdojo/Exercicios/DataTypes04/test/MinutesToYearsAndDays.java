package Exercicios.DataTypes04.test;

import java.util.Locale;
import java.util.Scanner;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        System.out.println("Digite os minutos: ");
        int minutosInput = teclado.nextInt();
        int minutosPorDia = 60 * 24;
        int minutosPorAno = minutosPorDia * 365;

        int anos = minutosInput / minutosPorAno;
        int dias = anos * 365 ;


        System.out.println("O tempo em anos é "+anos);
        System.out.println("O tempo em dias é "+dias);
    }
}
