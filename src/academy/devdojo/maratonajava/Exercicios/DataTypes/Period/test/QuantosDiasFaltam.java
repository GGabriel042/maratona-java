package Exercicios.DataTypes.Period.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class QuantosDiasFaltam {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate aniversario = LocalDate.of(2025,11,22);
        Period diferenca = Period.between(now, aniversario);
        String diferencaFormatada = "Faltam "+diferenca.getMonths()+" meses e "+diferenca.getDays()+" dias";
        System.out.println(diferencaFormatada);
    }
}
