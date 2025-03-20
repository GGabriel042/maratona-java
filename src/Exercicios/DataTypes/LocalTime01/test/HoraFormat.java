package Exercicios.DataTypes.LocalTime01.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HoraFormat {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        String hora = localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(hora);
    }
}
