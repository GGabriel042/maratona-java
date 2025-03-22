package Exercicios.DataTypes.LocalTime01.test;

import java.time.LocalTime;

public class AdicionaDuasHoras {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime nowDepois = now.plusHours(2).plusMinutes(30);
        System.out.println(nowDepois);
    }
}
