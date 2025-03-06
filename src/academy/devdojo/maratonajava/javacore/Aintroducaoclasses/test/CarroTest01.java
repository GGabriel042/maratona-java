package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Chevette";
        carro1.modelo = "classico";
        carro1.ano = 1995;

        carro2.nome = "Tesla";
        carro2.modelo = "X";
        carro2.ano = 2020;

        //carro1 = carro2;

        System.out.println(carro1.nome + " do modelo " + carro1.modelo + " feito no ano " + carro1.ano);
        System.out.println("\n" + carro2.nome + " do modelo " + carro2.modelo + " feito no ano " + carro2.ano);
    }
}
