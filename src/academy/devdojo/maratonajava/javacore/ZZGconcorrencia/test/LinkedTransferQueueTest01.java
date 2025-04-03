package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.Objects;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Gabriel"));
        System.out.println(tq.offer("Gonzaga"));
        System.out.println(tq.offer("Gonzaga", 10, TimeUnit.SECONDS));
        tq.put("Rafael");
        if (tq.hasWaitingConsumer()){
            tq.transfer("Michelangelo");
        }
        System.out.println(tq.tryTransfer("Leonardo"));
        System.out.println(tq.tryTransfer("Donatello", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}
