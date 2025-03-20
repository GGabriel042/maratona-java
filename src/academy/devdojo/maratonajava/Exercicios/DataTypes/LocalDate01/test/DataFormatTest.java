package Exercicios.DataTypes.LocalDate01.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataFormatTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(localDate);
    }
}
