package Exercicios.DataTypes.Period.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodCalculo {
    public static void main(String[] args) {
        LocalDate doisMil = LocalDate.of(2000, 01, 01);
        LocalDate doisMilVinteTres = LocalDate.of(2023, 05, 10);
        Period diferenca = Period.between(doisMil, doisMilVinteTres);
        String diferencaFormatada = diferenca.getYears() + " anos, " + diferenca.getMonths() + " meses e " + diferenca.getDays() + " dias";
        System.out.println(diferencaFormatada);
    }
}
