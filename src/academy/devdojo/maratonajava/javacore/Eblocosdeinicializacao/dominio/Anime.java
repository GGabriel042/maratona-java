package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for(int episiodio: this.episodios) {
            System.out.println(episiodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
