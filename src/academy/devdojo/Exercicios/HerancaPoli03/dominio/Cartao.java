package Exercicios.HerancaPoli03.dominio;

public class Cartao implements Pagamento{
    @Override
    public void pagar(double valor) {
        double valorParcela = valor / 10;
        System.out.println("Com o cartão voce poderá pagar em até 10 vezes de R$" + valorParcela);
    }
}
