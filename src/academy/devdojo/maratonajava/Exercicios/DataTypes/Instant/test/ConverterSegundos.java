package Exercicios.DataTypes.Instant.test;

import java.time.Instant;

public class ConverterSegundos {
    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(1633459200);
        System.out.println(instant);
    }
}
