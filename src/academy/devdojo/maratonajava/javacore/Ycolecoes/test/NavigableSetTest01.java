package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(),o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "One piece", 19.99, 0));
        mangas.add(new Manga(3L, "Attack on titan", 19.99, 1));
        mangas.add(new Manga(4L, "Berserk", 25.99, 0));
        mangas.add(new Manga(1L, "Zatch bell", 30.99, 2));
        mangas.add(new Manga(2L, "Pokemon", 16.99, 0));
        mangas.add(new Manga(10L, "Aaragon", 12.99, 15));
        mangas.add(new Manga(10L, "Aaragon 2", 15.99, 15));
        mangas.add(new Manga(11L, "Aaragon", 15.99, 15));



        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }

        System.out.println("----------------");

        Manga yuyu = new Manga(21L, "YuYu hakusho", 22, 5);

        //lower < --- menor
        //floor <= --- igual ou o mais proximo menor
        //higher > --- maior
        //ceiling >= --- igual ou o mais proximo maior

        System.out.println("Lower "+mangas.lower(yuyu));
        System.out.println("Floor "+mangas.floor(yuyu));
        System.out.println("Higher "+mangas.higher(yuyu));
        System.out.println("Ceiling "+mangas.ceiling(yuyu));

        System.out.println("---------------------");

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.pollLast());

    }
}
