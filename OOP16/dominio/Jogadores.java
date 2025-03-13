package Exercicios.OOP16.dominio;

import java.util.ArrayList;
import java.util.List;

public class Jogadores {
    private String nome;
    private List<Cartas> mao;

    public Jogadores(String nome) {
        this.nome = nome;
        this.mao = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cartas> getMao() {
        return mao;
    }

    public void receberCarta(Cartas carta) {
        mao.add(carta);
    }

    public void mostrarMao() {
        System.out.println("Cartas na mão do: " + nome + " :");
        for (int i = 0; i < mao.size(); i++) {
            Cartas carta = mao.get(i);
            System.out.println("Indice "+i + ": "+carta);
        }
    }
}
