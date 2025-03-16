package Exercicios.HerancaPoli04.test;

import Exercicios.HerancaPoli04.dominio.Passaro;
import Exercicios.HerancaPoli04.dominio.Pato;
import Exercicios.HerancaPoli04.dominio.Pedra;
import Exercicios.HerancaPoli04.dominio.Peixe;

public class NadadorVoadorTest {
    public static void main(String[] args) {
        Pato pato = new Pato();
        Peixe peixe = new Peixe();
        Passaro passaro = new Passaro();
        Pedra pedra = new Pedra();

        pato.nadar();
        pato.voar();
        System.out.println("-----------------");
        peixe.nadar();
        peixe.voar();
        System.out.println("-----------------");
        passaro.nadar();
        passaro.voar();
        System.out.println("-----------------");
        pedra.nadar();
        pedra.voar();
    }
}
