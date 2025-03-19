package academy.devdojo.maratonajava.javacore.QString.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Gabriel Gonzaga";
        nome.concat(" DevDojo");
        nome = nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Gabriel Gonzaga");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
    }
}
