package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000L;
        sumFor(num);
        sumStream(num);
        sumParallelStream(num);
        sumLongStream(num);
        sumParallelLongStream(num);
    }

    private static void sumStream(long num) {
        System.out.println("Sum StreamParallelInterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i +1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init)+"ms");
    }

    private static void sumParallelStream(long num) {
        System.out.println("Sum StreamInterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i +1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init)+"ms");
    }

    private static void sumLongStream(long num) {
        System.out.println("Sum LongStream");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init)+"ms");
    }

    private static void sumParallelLongStream(long num) {
        System.out.println("Sum LongStream");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init)+"ms");
    }

    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result+=1;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init)+"ms");
    }
}
