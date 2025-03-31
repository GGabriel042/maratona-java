package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "One piece", 19.99));
        mangas.add(new Manga(3L, "Attack on titan", 19.99));
        mangas.add(new Manga(4L, "Berserk", 25.99));
        mangas.add(new Manga(1L, "Zatch bell", 30.99));
        mangas.add(new Manga(2L, "Pokemon", 15.99));
        mangas.add(new Manga(2L, "Pokemon", 15.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
