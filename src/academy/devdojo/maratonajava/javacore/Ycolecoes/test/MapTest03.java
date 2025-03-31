package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Gabriel");
        Consumidor consumidor2 = new Consumidor("William");

        Manga manga1 = new Manga(5L, "One piece", 19.99);
        Manga manga2 = new Manga(3L, "Attack on titan", 19.99);
        Manga manga3 = new Manga(4L, "Berserk", 25.99);
        Manga manga4 = new Manga(1L, "Zatch bell", 30.99);
        Manga manga5 = new Manga(2L, "Pokemon", 15.99);

        List<Manga> listConsumidor1 = List.of(manga1, manga2, manga5);
        List<Manga> listConsumidor2 = List.of(manga3, manga4, manga5);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, listConsumidor1);
        consumidorMangaMap.put(consumidor2, listConsumidor2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println("---"+entry.getKey().getNome()+"---");
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }
            System.out.println("-----------");
        }

    }
}
