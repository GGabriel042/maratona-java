package Exercicios.OOP02.dominio;

public class ContaBancaria {
    private String nomeDoTitular;
    private String numeroDaConta;
    private double saldo;

    public ContaBancaria(String nomeDoTitular, String numeroDaConta, double saldo) {
        this.nomeDoTitular = nomeDoTitular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double deposito(double x) {
        saldo += x;
        return saldo;
    }

    public double saque(double x) {
        saldo -= x;
        return saldo;
    }
}
