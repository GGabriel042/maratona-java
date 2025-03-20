package Exercicios.OOP16.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JogoCartas {
    protected Baralho baralho;
    protected List<Jogadores> jogadores;
    private int turnoJogador;
    private final Scanner scanner;
    private Mesa mesa;

    public JogoCartas() {
        this.baralho = new Baralho();
        this.jogadores = new ArrayList<>();
        this.turnoJogador = 0;
        this.scanner = new Scanner(System.in);
        this.mesa = new Mesa();
    }

    public Baralho getBaralho() {
        return baralho;
    }

    public void setBaralho(Baralho baralho) {
        this.baralho = baralho;
    }

    public List<Jogadores> getJogador() {
        return jogadores;
    }

    public void setJogador(List<Jogadores> jogadores) {
        this.jogadores = jogadores;
    }

    public int getTurnoJogador() {
        return turnoJogador;
    }

    public void setTurnoJogador(int turnoJogador) {
        this.turnoJogador = turnoJogador;
    }

    public void cadastrasJogadores() {
        System.out.println("Jogadores digitem seus nomes para começar");
        System.out.println("Precisa de 4 jogadores para esse jogo");

        for (int i = 0; i < 4; i++){
            String nomeJogador = scanner.nextLine();
            jogadores.add(new Jogadores(nomeJogador));
        }

        embaralharJogadores();
        mostrarOrdemJogadores();
    }

    public void embaralharJogadores(){
        Collections.shuffle(jogadores);
    }

    public void mostrarOrdemJogadores() {
        System.out.println("Ordem dos jogadores:");
        for (int i = 0; i < jogadores.size(); i++) {
            System.out.println((i + 1) + "°: " + jogadores.get(i).getNome());
        }
    }

    public void distribuirCartas() {
        for (Jogadores jogador : jogadores) {
            for (int i = 0; i < 7; i++) {
                Cartas carta = baralho.getCartas().remove(0);
                jogador.receberCarta(carta);
            }
        }
    }

    public void comecarJogo(){
        baralho.embaralharBaralho();
        cadastrasJogadores();
        distribuirCartas();

        for (Jogadores jogador : jogadores) {
            jogador.mostrarMao();
            System.out.println("--------------");
        }

        Cartas primeiraCarta = baralho.getCartas().remove(0);
        mesa.jogarCarta(primeiraCarta);
        System.out.println("Primeira carta na mesa: " + primeiraCarta);

        while (true) {
            Jogadores jogadorAtual = jogadores.get(turnoJogador);
            System.out.println("\nVez do jogador: " + jogadorAtual.getNome());
            jogadorAtual.mostrarMao();

            System.out.println("Escolha o índice da carta que deseja jogar (ou -1 para comprar uma carta):");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == -1) {

                if (baralho.getCartas().isEmpty()) {
                    System.out.println("O baralho está vazio. O jogo acabou!");
                    break;
                }
                Cartas cartaComprada = baralho.getCartas().remove(0);
                jogadorAtual.receberCarta(cartaComprada);
                System.out.println("Jogador " + jogadorAtual.getNome() + " comprou uma carta: " + cartaComprada);

                System.out.println("Ultima carta jogada: "+mesa.getUltimaCartaJogada());
                System.out.println("Escolha o índice da carta que deseja jogar (ou -1 para comprar uma carta):");

            } else if (escolha >= 0 && escolha < jogadorAtual.getMao().size()) {

                Cartas cartaEscolhida = jogadorAtual.getMao().get(escolha);

                if (mesa.isJogadaValida(cartaEscolhida)) {

                    jogadorAtual.getMao().remove(escolha);
                    mesa.jogarCarta(cartaEscolhida);
                    System.out.println("Jogador " + jogadorAtual.getNome() + " jogou: " + cartaEscolhida);


                    if (jogadorAtual.getMao().isEmpty()) {
                        System.out.println("Jogador " + jogadorAtual.getNome() + " venceu o jogo!");
                        break;
                    }
                } else {

                    System.out.println("Jogada inválida! A carta deve ter a mesma cor ou número da última carta na mesa.");
                    System.out.println("Ultima carta jogada: "+mesa.getUltimaCartaJogada());
                    continue;
                }
            } else {

                System.out.println("Escolha inválida. Tente novamente.");
                continue;
            }

            turnoJogador = (turnoJogador + 1) % jogadores.size();
        }
    }
}
