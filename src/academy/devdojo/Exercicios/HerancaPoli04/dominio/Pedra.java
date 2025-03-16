package Exercicios.HerancaPoli04.dominio;

public class Pedra implements Voador, Nadador{
    @Override
    public void nadar() {
        System.out.println("A pedra não consegue nadar");
    }

    @Override
    public void voar() {
        System.out.println("A pedra não consegue voar");
    }
}
