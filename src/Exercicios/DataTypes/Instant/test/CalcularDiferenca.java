package Exercicios.DataTypes.Instant.test;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class CalcularDiferenca {
    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant antes = Instant.now().minus(2, ChronoUnit.HOURS);
        Duration diferenca = Duration.between(now, antes);
        long diferencaSegundos = diferenca.getSeconds();
        System.out.println(diferencaSegundos);
    }
}
