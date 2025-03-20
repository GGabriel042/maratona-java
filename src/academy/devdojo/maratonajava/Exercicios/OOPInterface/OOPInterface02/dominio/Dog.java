package Exercicios.OOPInterface02.dominio;

public class Dog implements Animal {

    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}
