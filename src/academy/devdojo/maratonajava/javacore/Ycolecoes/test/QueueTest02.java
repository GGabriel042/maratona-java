package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L, "One piece", 19.99));
        mangas.add(new Manga(3L, "Attack on titan", 20.99));
        mangas.add(new Manga(4L, "Berserk", 25.99));
        mangas.add(new Manga(1L, "Zatch bell", 30.99));
        mangas.add(new Manga(2L, "Pokemon", 15.99));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
