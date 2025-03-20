package Exercicios.OOPInterface04.dominio;

public class SavingAccount implements Account{
    private double dinheiroNaConta;
    private double rendimento;

    public SavingAccount(double dinheiroInicial) {
        this.dinheiroNaConta = dinheiroInicial;
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
        double dinheiroNaContaRendimento;
        if (dinheiroNaConta < 10000) {
            System.out.println("Seu conta não tem dinheiro suficiente para rendimento");
        } else if (dinheiroNaConta > 10000 && dinheiroNaConta < 100000) {
            rendimento = dinheiroNaConta / 10;
            dinheiroNaContaRendimento = dinheiroNaConta + rendimento;
            System.out.println("Seu rendimento é de 10%, o que da "+rendimento);
            System.out.println("No final do mes, voce tera "+dinheiroNaContaRendimento);
        } else {
            rendimento = dinheiroNaConta / 25;
            dinheiroNaContaRendimento = dinheiroNaConta + rendimento;
            System.out.println("Seu rendimento é de 25%, o que da "+rendimento);
            System.out.println("No final do mes, voce tera "+dinheiroNaContaRendimento);
        }
    }

    @Override
    public double getBalances() {
        return dinheiroNaConta;
    }
}
