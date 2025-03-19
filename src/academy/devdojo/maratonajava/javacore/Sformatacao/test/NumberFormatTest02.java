package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeEN = Locale.US;
        NumberFormat[] nfa = new NumberFormat[5];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[1] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        nfa[4] = NumberFormat.getCurrencyInstance(localeEN);

        double valor = 10_000_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "$1,000.21";
        try {
            System.out.println(nfa[4].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
