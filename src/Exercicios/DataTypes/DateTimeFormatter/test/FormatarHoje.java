package Exercicios.DataTypes.DateTimeFormatter.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatarHoje {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        String hojeFormatada = hoje.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(hojeFormatada);
    }
}
