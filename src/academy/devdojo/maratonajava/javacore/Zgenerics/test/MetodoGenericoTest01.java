package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa Marota"));

        System.out.println("-----------");

        List<Barco> barcoList = criarArrayComUmObjeto2(new Barco("Lancha"));
        System.out.println(barcoList);
    }

    private static <T> void criarArrayComUmObjeto(T t){
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
    }

    private static <T> List<T> criarArrayComUmObjeto2(T t){
        return List.of(t);
    }
}
