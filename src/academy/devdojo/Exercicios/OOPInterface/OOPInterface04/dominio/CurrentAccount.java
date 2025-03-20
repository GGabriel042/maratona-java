package Exercicios.OOPInterface04.dominio;

public class CurrentAccount implements Account{
    private double dinheiroNaConta;

    public CurrentAccount(double dinheiroNaConta) {
        this.dinheiroNaConta = dinheiroNaConta;
    }

    @Override
    public void deposit(double amount) {
        dinheiroNaConta += amount;
        System.out.println("Voce depositou a quantia de "+ amount);
        System.out.println("Sua conta agora tem "+dinheiroNaConta);
    }

    @Override
    public void withdraw(double amount) {
        if (dinheiroNaConta < amount) {
            System.out.println("Voce não pode retirar essa quantia");
        }
        dinheiroNaConta = dinheiroNaConta - amount;
        System.out.println("Voce retirou a quantia de "+amount);
        System.out.println("Sua conta agora tem "+dinheiroNaConta);
    }

    @Override
    public void rendimento() {
        System.out.println("Não existe rendimento nesse tipo de conta");
    }

    @Override
    public double getBalances() {
        return dinheiroNaConta;
    }
}
