package Exercicios.DataTypes.ZonedDateTime.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class SaoPauloMenosLondres {
    public static void main(String[] args) {
        ZoneId sp = ZoneId.of("America/Sao_Paulo");
        ZoneId londres = ZoneId.of("Europe/London");
        ZonedDateTime nowSp = ZonedDateTime.now(sp);
        ZonedDateTime nowLondres = ZonedDateTime.now(londres);
        long diferenca = nowSp.getHour() - nowLondres.getHour();
        System.out.println("A diferença de horas de sp para londres é de "+diferenca);
    }
}
