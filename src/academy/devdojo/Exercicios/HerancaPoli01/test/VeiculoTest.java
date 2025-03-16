package Exercicios.HerancaPoli01.test;

import Exercicios.HerancaPoli01.dominio.Carro;
import Exercicios.HerancaPoli01.dominio.Moto;
import Exercicios.HerancaPoli01.dominio.Veiculo;

public class VeiculoTest {
    public static void main(String[] args) {
        Veiculo moto = new Moto(80);
        Veiculo carro = new Carro(80);

        moto.acelerar(50);
        carro.acelerar(30);
    }
}
