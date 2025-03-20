package Exercicios.DataTypes.LocalDateTime.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        String localDateTimeFormatada = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(localDateTimeFormatada);
    }
}
