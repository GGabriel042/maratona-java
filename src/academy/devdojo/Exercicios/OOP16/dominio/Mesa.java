package Exercicios.OOP16.dominio;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private List<Cartas> cartasNaMesa; // Cartas que estão na mesa
    private Cartas ultimaCartaJogada; // Última carta jogada na mesa

    public Mesa() {
        this.cartasNaMesa = new ArrayList<>();
    }

    // Adiciona uma carta à mesa
    public void jogarCarta(Cartas carta) {
        cartasNaMesa.add(carta);
        ultimaCartaJogada = carta; // Atualiza a última carta jogada
    }

    public boolean isJogadaValida(Cartas carta) {
        if (ultimaCartaJogada == null) {
            return true; // Primeira jogada, qualquer carta é válida
        }

        return carta.getCor().equals(ultimaCartaJogada.getCor()) ||
                carta.getNumero() == ultimaCartaJogada.getNumero();
    }

    public Cartas getUltimaCartaJogada() {
        return ultimaCartaJogada;
    }

    public void mostrarCartasNaMesa() {
        System.out.println("Cartas na mesa:");
        for (Cartas carta : cartasNaMesa) {
            System.out.println(carta);
        }
    }
}
