package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        //utiliza alpha 2 para paises

        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeBR = new Locale("pt", "BR");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Italia "+df1.format(calendar.getTime()));
        System.out.println("Suiça "+df2.format(calendar.getTime()));
        System.out.println("Brasil "+df3.format(calendar.getTime()));
        System.out.println("India "+df4.format(calendar.getTime()));
        System.out.println("Japão "+df5.format(calendar.getTime()));
        System.out.println("Holanda "+df6.format(calendar.getTime()));

        System.out.println("-----------------");

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeBR.getDisplayCountry());
        System.out.println(localeJapao.getDisplayCountry(localeJapao));
        System.out.println(localeItaly.getDisplayLanguage(localeJapao));
    }
}
