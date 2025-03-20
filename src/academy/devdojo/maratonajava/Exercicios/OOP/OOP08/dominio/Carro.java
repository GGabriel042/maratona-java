package Exercicios.OOP08.dominio;

public class Carro {
    private String modelo;
    private String marca;
    private int velocidadeAtual;

    public Carro(String modelo, String marca, int velocidadeAtual) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(int x) {
        velocidadeAtual += x;
    }

    public void frear(int x) {
        velocidadeAtual -= x;
    }

    public void imprime() {
        System.out.println("O carro "+modelo+ " da marca "+marca+" está na velocidade "+velocidadeAtual+"km/h");
    }
}
