package academy.devdojo.maratonajava.javacore.PWrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1;
        float floatP = 1F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        //List<int>, <byte>,  <double>      NÃO FUNCIONA
        //List<Integer>, <Byte>,  <Double>      FUNCIONA

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;


        int i = intW;
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("tRuE");
//        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
