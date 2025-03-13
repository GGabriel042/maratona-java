package Exercicios.OOP16.dominio;

import java.util.ArrayList;
import java.util.Collections;

public class Baralho {
    private int quantidade;
    private ArrayList<Cartas> cartas;

    public Baralho() {
        this.cartas = new ArrayList<>();
        this.quantidade = 60;
        construirBaralho();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ArrayList<Cartas> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Cartas> cartas) {
        this.cartas = cartas;
    }

    public void construirBaralho(){
        String[] cores = {"Azul", "Verde", "Vermelho", "Amarelo"};

        for (String cor : cores){
            for (int numero = 1; numero <= 20; numero ++){
                cartas.add( new Cartas(cor, numero));
            }
        }
    }

    public void embaralharBaralho() {
        Collections.shuffle(cartas);
    }

    public void mostrarBaralho() {
        for (Cartas carta : cartas) {
            System.out.println(carta);
        }
    }
}
