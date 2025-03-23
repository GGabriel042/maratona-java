package Exercicios.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest01 {
    public static void main(String[] args) {
        String input = "hello, hello world, Hello";

        String regex = "(?<!\\S)(hello|Hello)(?!\\S)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println("Match found at index: "+matcher.start()+" - "+matcher.group());
        }
    }
}
