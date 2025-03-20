package Exercicios.DataTypes.LocalDateTime.test;

import java.time.Duration;
import java.time.LocalDateTime;

public class CalculoAnoNovo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime anoNovo = LocalDateTime.of(2026,01,01,00,00,00);
        Duration d1 = Duration.between(now, anoNovo);
        long dDays = d1.toDays();
        long dHoras = d1.toHours() % 24;
        long dMinutos = d1.toMinutes() % 60;
        System.out.println("Faltam "+ dDays+" dias, "+dHoras+" horas e "+dMinutos+" minutos para o ano novo");
    }
}
