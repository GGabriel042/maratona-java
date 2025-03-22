package Exercicios.DataTypes.Period.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PeriodAdicionar {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate adicionar = now.plusYears(2).minusMonths(6).plusDays(15);
        String adicionarFormatado = adicionar.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(adicionarFormatado);
    }
}
