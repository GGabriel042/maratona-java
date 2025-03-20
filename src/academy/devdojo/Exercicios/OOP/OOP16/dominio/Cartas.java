package Exercicios.OOP16.dominio;

public class Cartas {
    private String cor;
    private int numero;

    public Cartas(String cor, int numero) {
        this.cor = cor;
        this.numero = numero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Cartas{" +
                "cor='" + cor + '\'' +
                ", numero=" + numero +
                '}';
    }
}
