package Exercicios.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest04 {
    public static void main(String[] args) {
        String input = "As datas são 25/12/2023, 01/01/2024 e 31/02/2023.";

        String regex = "(\\d{2})/(\\d{2})/(\\d{4})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.start() +" - "+ matcher.group());
        }
    }
}
