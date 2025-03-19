package academy.devdojo.maratonajava.javacore.QString.test;

public class StringTest01 {
    public static void main(String[] args) {

        String nome = "Gabriel";  //String constant pool
        String nome2 = "Gabriel";

        nome = nome.concat(" Gonzaga");

        System.out.println(nome);
        System.out.println(nome2);
        System.out.println(nome == nome2);


        String nome3 = new String("Gabriel");  // 1 variavel de referencia, 2 objeto do tipo String, 3 string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
