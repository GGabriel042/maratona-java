package Exercicios.HerancaPoli04.dominio;

public class Passaro implements Voador, Nadador{
    @Override
    public void nadar() {
        System.out.println("O passaro não consegue nadar");
    }

    @Override
    public void voar() {
        System.out.println("O passaro consegue voar");
    }
}
