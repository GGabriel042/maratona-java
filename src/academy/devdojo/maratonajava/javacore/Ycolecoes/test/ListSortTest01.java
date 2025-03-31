package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("One piece");
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        mangas.add("Hellsing");
        mangas.add("Pokemon");

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.1);

        Collections.sort(dinheiros);

        Collections.sort(mangas);

        for (String manga: mangas){
            System.out.println(manga);
        }
        System.out.println("------------");
        for (Double dinheiro : dinheiros){
            System.out.println(dinheiro);
        }
    }
}
