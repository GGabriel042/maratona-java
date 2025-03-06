package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
