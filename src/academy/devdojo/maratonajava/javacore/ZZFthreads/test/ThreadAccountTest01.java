package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("FODEO");
            }
        }
    }

//    private static synchronized void print(){
//
//    }

    private void withdrawal(int amount){
        System.out.println(getThreadName() + " ##### fora do synchronized");
        synchronized (account) {
            System.out.println(getThreadName() + " dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                account.withdrawal(amount);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(getThreadName() + " completou o saque, valor atual da conta " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro suficiente para " + getThreadName() + " efetuar o saque " + account.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
