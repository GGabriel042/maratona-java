package Exercicios.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest05 {
    public static void main(String[] args) {
        String input1 = "Senha@123";
        String input2 = "senhafraca";
        String input3 = "Senha123";
        String input4 = "SENHA@123";

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*\\W).{8,}$";

        System.out.println(input1.matches(regex));
        System.out.println(input2.matches(regex));
        System.out.println(input3.matches(regex));
        System.out.println(input4.matches(regex));
    }
}
