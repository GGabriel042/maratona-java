package Exercicios.HerancaPoli04.dominio;

public class Peixe implements Voador, Nadador{
    @Override
    public void nadar() {
        System.out.println("O peixe consegue nadar");
    }

    @Override
    public void voar() {
        System.out.println("O peixe não consegue voar");
    }
}
