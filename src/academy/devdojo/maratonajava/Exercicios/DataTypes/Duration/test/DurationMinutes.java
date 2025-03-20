package Exercicios.DataTypes.Duration.test;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMinutes {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime antes = LocalTime.now().minusHours(1);
        long minutos = Duration.between(now,antes).toMinutes();
        System.out.println(minutos);
    }
}
