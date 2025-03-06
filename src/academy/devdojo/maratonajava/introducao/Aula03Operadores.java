package academy.devdojo.maratonajava.introducao;

public class Aula03Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;

        int resultadoAdicao = numero01 + numero02;
        int resultadoSubtracao = numero01 - numero02;
        int resultadoDivisao = numero02 / numero01;
        int resultadoMultiplicacao = numero01 * numero02;

        System.out.println(resultadoAdicao);
        System.out.println(resultadoSubtracao);
        System.out.println(resultadoDivisao);
        System.out.println(resultadoMultiplicacao);

        int resto = 20 % 2;
        System.out.println(resto);


        boolean isMaior = 10 > 20;
        boolean isMaiorIgual = 10 >= 20;
        boolean isMenor = 10 < 20;
        boolean isMenorIgual = 10 <= 20;
        boolean isIgual = 10 == 20;
        boolean isDiferente = 10 != 20;

        System.out.println("Is dez maior que vinte? " + isMaior);
        System.out.println("Is dez maior ou igual que vinte? " + isMaiorIgual);
        System.out.println("Is dez menor que vinte? " + isMenor);
        System.out.println("Is dez menor ou igual que vinte? " + isMenorIgual);
        System.out.println("Is dez igual que vinte? " + isIgual);
        System.out.println("Is dez diferente que vinte? " + isDiferente);


        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQue30 = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario > 3381;

        System.out.println("Esta dentro da lei? " + isDentroDaLeiMaiorQue30);
        System.out.println("Esta dentro da lei? " + isDentroDaLeiMenorQue30);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
        System.out.println("isPlaystationCincoCompravel? " + isPlaystationCincoCompravel);


        double bonus = 1800;
        bonus += 1000;
        bonus -= 1300;
        bonus /= 3;
        bonus *= 2;
        bonus %= 2;
        System.out.println(bonus);

        int contador = 0;
        contador++;
        contador--;

        int contador2 = 0;

        System.out.println(contador);
        System.out.println(++contador2);
    }
}
