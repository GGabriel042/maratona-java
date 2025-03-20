package Exercicios.HerancaPoli04.dominio;

public class Pato implements Voador, Nadador{
    @Override
    public void nadar() {
        System.out.println("O pato consegue nadar");
    }

    @Override
    public void voar() {
        System.out.println("O pato consegue voar");
    }
}
