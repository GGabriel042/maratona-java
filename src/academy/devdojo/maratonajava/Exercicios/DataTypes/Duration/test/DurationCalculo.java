package Exercicios.DataTypes.Duration.test;

import java.time.Duration;
import java.time.LocalTime;

public class DurationCalculo {
    public static void main(String[] args) {
        LocalTime now = LocalTime.of(9,0);
        LocalTime depois = LocalTime.of(17,30);
        Duration calculo = Duration.between(now,depois);
        System.out.println("A diferença de horas é de "+calculo.toHours()+":"+(calculo.toMinutes() % 60));
    }
}
