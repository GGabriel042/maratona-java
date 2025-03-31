package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Gabriel");
        Consumidor consumidor2 = new Consumidor("William");

        Manga manga1 = new Manga(5L, "One piece", 19.99);
        Manga manga2 = new Manga(3L, "Attack on titan", 19.99);
        Manga manga3 = new Manga(4L, "Berserk", 25.99);
        Manga manga4 = new Manga(1L, "Zatch bell", 30.99);
        Manga manga5 = new Manga(2L, "Pokemon", 15.99);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga3);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
