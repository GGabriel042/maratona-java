package Exercicios.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest02 {
    public static void main(String[] args) {
        String input1 = "12345";
        String input3 = "123abc";
        String input2 = "987654321";

        String regex = "\\d+$";

        System.out.println(input1.matches(regex));
        System.out.println(input2.matches(regex));
        System.out.println(input3.matches(regex));
    }
}
