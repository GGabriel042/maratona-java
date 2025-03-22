package Exercicios.DataTypes.Duration.test;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DurationAdicionar {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime adicionar = now.plusHours(3).plusMinutes(30);
        System.out.println(adicionar.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
