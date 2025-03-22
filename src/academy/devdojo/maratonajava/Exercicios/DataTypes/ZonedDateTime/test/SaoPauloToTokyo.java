package Exercicios.DataTypes.ZonedDateTime.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class SaoPauloToTokyo {
    public static void main(String[] args) {
        ZonedDateTime sp = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        System.out.println(sp);
        ZonedDateTime spTokyo = sp.withZoneSameInstant(tokyo);
        System.out.println(spTokyo);
    }
}
