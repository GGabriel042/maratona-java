package Exercicios.OOPInterface04.test;

import Exercicios.OOPInterface04.dominio.Bank;
import Exercicios.OOPInterface04.dominio.CurrentAccount;
import Exercicios.OOPInterface04.dominio.SavingAccount;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingAccount savingAccount = new SavingAccount(50000);
        CurrentAccount currentAccount = new CurrentAccount(10000);
        bank.criarAccount(savingAccount);
        bank.criarAccount(currentAccount);
        bank.printAccountBalances();
        savingAccount.rendimento();
        savingAccount.withdraw(500);
        savingAccount.rendimento();
    }
}
