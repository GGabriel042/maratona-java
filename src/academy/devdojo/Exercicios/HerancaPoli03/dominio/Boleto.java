package Exercicios.HerancaPoli03.dominio;

public class Boleto implements Pagamento{
    @Override
    public void pagar(double valor) {
        double valorFinal = valor - (valor / 10);
        System.out.println("Pagando com um boleto voce tera um desconto de 10%, levando o valor para R$"+valorFinal);
    }
}
