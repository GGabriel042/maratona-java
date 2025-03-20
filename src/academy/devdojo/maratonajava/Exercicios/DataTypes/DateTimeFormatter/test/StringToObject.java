package Exercicios.DataTypes.DateTimeFormatter.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringToObject {
    public static void main(String[] args) {
        String dia = "15/10/2023 14:30:45";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime diaObjeto = LocalDateTime.parse(dia, formatter);
        System.out.println(diaObjeto);
    }
}
