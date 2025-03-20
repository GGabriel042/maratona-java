package Exercicios.DataTypes.LocalDate01.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate natal = LocalDate.of(2025,12,25);

        Period p1 = Period.between(now, natal);
        System.out.println("Faltam "+p1.getMonths()+ " meses e "+p1.getDays()+" dias");
    }
}
