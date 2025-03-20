package Exercicios.HerancaPoli03.test;

import Exercicios.HerancaPoli03.dominio.Boleto;
import Exercicios.HerancaPoli03.dominio.Cartao;
import Exercicios.HerancaPoli03.dominio.Pagamento;

public class PagamentoTest {
    public static void main(String[] args) {
        Pagamento cartao = new Cartao();
        Pagamento boleto = new Boleto();

        cartao.pagar(5000);
        System.out.println("-------------------");
        boleto.pagar(5000);
    }
}
