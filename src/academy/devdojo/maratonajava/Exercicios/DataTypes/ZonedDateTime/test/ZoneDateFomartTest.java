package Exercicios.DataTypes.ZonedDateTime.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDateFomartTest {
    public static void main(String[] args) {
        ZonedDateTime sp = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        String spFormatada = sp.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z"));
        System.out.println(spFormatada);
    }
}
