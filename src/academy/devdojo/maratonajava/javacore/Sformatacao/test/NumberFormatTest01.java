package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeEN = Locale.ENGLISH;
        NumberFormat[] nfa = new NumberFormat[5];

        nfa[0] = NumberFormat.getNumberInstance();
        nfa[2] = NumberFormat.getNumberInstance(localeJP);
        nfa[1] = NumberFormat.getNumberInstance(localeBR);
        nfa[3] = NumberFormat.getNumberInstance(localeIT);
        nfa[4] = NumberFormat.getNumberInstance(localeEN);

        double valor = 1_000.2130;

        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1000.2130";
        try {
            System.out.println(nfa[4].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
