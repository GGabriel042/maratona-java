package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        String helloBundle = bundle.getString("hello");
        String goodMorningBundle = bundle.getString("good.morning");
        System.out.println(helloBundle);
        System.out.println(goodMorningBundle);

        System.out.println("-------------------");

        ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        String helloBundle2 = bundle2.getString("hello");
        String goodMorningBundle2 = bundle2.getString("good.morning");
        System.out.println(helloBundle2);
        System.out.println(goodMorningBundle2);

        //Locale("fr","CA");                                começa com o locale
        //messages_fr_Ca.properties                         tenta achar o messages.properties do locale
        //messages_fr.properties                            tenta achar o pelo idioma
        //messages_pt_BR.properties                         tenta achar no locale padrão
        //messages_pt.properties                            tenta achar no idioma padrão
        //messages.properties                               tenta achar um base
    }
}
