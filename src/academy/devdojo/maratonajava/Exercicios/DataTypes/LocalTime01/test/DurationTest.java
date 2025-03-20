package Exercicios.DataTypes.LocalTime01.test;

import java.time.Duration;
import java.time.LocalTime;

public class DurationTest {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime horaDormir = LocalTime.of(23,50);
        Duration d1 = Duration.between(now, horaDormir);
        long diferencaHora = d1.toHours();
        long diferencaMinutos = (d1.toMinutes()) % 60;
        System.out.println("Faltam "+diferencaHora+" horas e "+diferencaMinutos+" minutos");
    }
}
