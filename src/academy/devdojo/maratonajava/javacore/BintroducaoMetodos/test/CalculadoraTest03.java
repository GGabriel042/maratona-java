package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividiDoisNumeros(20,2);
        System.out.println(result);

        System.out.println("-------------");

        calculadora.imprimeDivisaoDeDoisNumeros(86,0);
    }
}
