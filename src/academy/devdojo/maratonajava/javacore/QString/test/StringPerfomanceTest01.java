package academy.devdojo.maratonajava.javacore.QString.test;

public class StringPerfomanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio) + " milisegundos");

        System.out.println("------------");

        inicio = System.currentTimeMillis();
        concatStringBuilder(3_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (fim - inicio) + " milisegundos");

        System.out.println("------------");

        inicio = System.currentTimeMillis();
        concatStringBuffer(3_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " + (fim - inicio) + " milisegundos");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto +=i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
             sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb2 = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb2.append(i);
        }
    }
}
