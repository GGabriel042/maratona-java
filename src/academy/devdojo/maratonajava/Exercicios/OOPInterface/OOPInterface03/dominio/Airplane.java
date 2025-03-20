package Exercicios.OOPInterface03.dominio;

public class Airplane implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("Airplane if flying");
    }
}
