package Exercicios.HerancaPoli02.test;

import Exercicios.HerancaPoli02.dominio.Cachorro;
import Exercicios.HerancaPoli02.dominio.Gato;
import Exercicios.HerancaPoli02.dominio.Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        gato.emitirSom();
        cachorro.emitirSom();
    }
}
