package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao 2");
    }

    static {
        System.out.println("Dentro do bloco de inicializacao 3");
    }

//    {
//        System.out.println("Dentro do bloco de inicializacao não estático");
//    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for(int episiodio: Anime.episodios) {
            System.out.print(episiodio + " ");
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
