package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        //    \d   = retorna todos os digitos
        //    \D   = retorna todos que não sao digitos
        //    \s   = retorna todos espaços em branco        \t \n \f \r
        //    \S   = retorna todos exceto os espaços em branco
        //    \w   = retorna a-z A-Z, digitos, _
        //    \W   = retorna todos que não forem a-z A-Z, digitos, _
        //    []   = retorna expecificando as letras
        //    ?   = Zero ou uma
        //    *   = Zero ou mais
        //    +   = uma ou mais
        //    {n,m}   = de n até m
        //    ()   = agrupamento
        //    |   = ou
        //    o (v|c) o   = ovo | oco
        //    $   =  fim da linha
        //    .  1.3 = 123, 133, 1@3, 1A3         caracter coringa
        //    ^ = caracter de negação

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail ";
        System.out.println("Email valido");
        System.out.println(" "+"#@!zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
        
    }
}
