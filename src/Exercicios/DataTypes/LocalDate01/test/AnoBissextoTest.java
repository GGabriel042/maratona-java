package Exercicios.DataTypes.LocalDate01.test;

import java.time.LocalDate;

public class AnoBissextoTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        boolean anoBissexto = localDate.isLeapYear();

        if (anoBissexto) {
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }
    }
}
