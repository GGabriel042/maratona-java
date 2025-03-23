package Exercicios.Regex.test;

public class RegexTest03 {
    public static void main(String[] args) {
        String input1 = "user@example.com";
        String input2 = "user.name+tag+sorting@example.com";
        String input3 = "user@sub.example.co.uk";
        String input4 = "user@.com";
        String input5 = "123user@example.com";
        String input6 = "user123@example.com";
        String input7 = "user@123example.com";

        String regex = "(\\w+)[@](\\w+)\\.(\\w+)";

        System.out.println(input1.matches(regex));
        System.out.println(input2.matches(regex));
        System.out.println(input3.matches(regex));
        System.out.println(input4.matches(regex));
        System.out.println(input5.matches(regex));
        System.out.println(input6.matches(regex));
        System.out.println(input7.matches(regex));
    }
}
