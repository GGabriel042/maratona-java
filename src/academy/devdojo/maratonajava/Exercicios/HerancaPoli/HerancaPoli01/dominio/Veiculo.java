package Exercicios.HerancaPoli01.dominio;

public class Veiculo {
    protected int velocidadeInicial;
    protected int velocidadeAcelerada;
    protected int velocidadeFinal;

    public Veiculo(int velocidadeInicial) {
        this.velocidadeInicial = velocidadeInicial;
    }

    public void acelerar(int velocidadeAcelerada) {
        velocidadeFinal = velocidadeInicial + velocidadeAcelerada;
    }
}
