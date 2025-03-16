package Exercicios.HerancaPoli01.dominio;

public class Carro extends Veiculo{
    public Carro(int velocidadeInicial) {
        super(velocidadeInicial);
    }

    @Override
    public void acelerar(int velocidadeAcelerada) {
        super.acelerar(velocidadeAcelerada);
        System.out.println("O carro começou na velocidade " + velocidadeInicial);
        System.out.println("O carro agora está na velocidade " + velocidadeFinal);
    }
}
