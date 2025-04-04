package academy.devdojo.maratonajava.javacore.ZZFthreads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Membros {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen(){
        return open;
    }

    public int pendingEmail(){
        synchronized (emails){
            return emails.size();
        }
    }

    public void addMemberEmail(String email) {
        synchronized (this.emails){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " adicionou email na lista");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retriveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+ " checking if there are emails");
        synchronized (this.emails){
            while (this.emails.size()==0){
                if (!open) return null;
                System.out.println(Thread.currentThread().getName()+ " não tem email disponivel na lista, entrando em modo de espera");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close(){
        open = false;
        synchronized (this.emails){
            System.out.println(Thread.currentThread().getName() + " notificando a todos, que não estamos adicionando emails");
            this.emails.notifyAll();
        }
    }
}
