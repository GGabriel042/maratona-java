package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "One piece", 19.99));
        mangas.add(new Manga(3L, "Attack on titan", 19.99));
        mangas.add(new Manga(4L, "Berserk", 25.99));
        mangas.add(new Manga(1L, "Zatch bell", 30.99));
        mangas.add(new Manga(2L, "Pokemon", 15.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-------------");

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-------------");

//      Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
