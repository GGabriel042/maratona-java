package Exercicios.HerancaPoli01.dominio;

public class Moto extends Veiculo{
    public Moto(int velocidadeInicial) {
        super(velocidadeInicial);
    }

    @Override
    public void acelerar(int velocidadeAcelerada) {
        super.acelerar(velocidadeAcelerada);
        System.out.println("A moto começou na velocidade " + velocidadeInicial);
        System.out.println("A moto agora está na velocidade " + velocidadeFinal);
    }
}
