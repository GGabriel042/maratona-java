package Exercicios.DataTypes07.test;

import java.time.*;

public class CurrentTime {
    public static void main(String[] args) {

        ZoneId zoneTokyo = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneTokyo);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zoneDateTokyo = now.atZone(zoneTokyo);
        System.out.println(zoneDateTokyo);

        ZonedDateTime zoneNowTokyo = Instant.now().atZone(zoneTokyo);
        System.out.println(zoneNowTokyo);
    }
}
