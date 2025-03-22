package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        //    \d   = retorna todos os digitos
        //    \D   = retorna todos que não sao digitos
        //    \s   = retorna todos espaços em branco        \t \n \f \r
        //    \S   = retorna todos exceto os espaços em branco
        //    \w   = retorna a-z A-Z, digitos, _
        //    \W   = retorna todos que não forem a-z A-Z, digitos, _

        String regex = "\\W";
        //String texto = "abaaba";
        String texto2 = "@#hhj2 12gvh21_";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
