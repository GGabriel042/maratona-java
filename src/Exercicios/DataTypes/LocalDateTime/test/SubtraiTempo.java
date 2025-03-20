package Exercicios.DataTypes.LocalDateTime.test;

import java.time.LocalDateTime;

public class SubtraiTempo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime diaSubtraido = now.minusDays(5).minusHours(3);
        System.out.println(diaSubtraido);
    }
}
