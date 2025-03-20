package Exercicios.DataTypes05.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimeGMT {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String formatterTime = localTime.format(timeFormatter);
        System.out.println(formatterTime);
    }
}
