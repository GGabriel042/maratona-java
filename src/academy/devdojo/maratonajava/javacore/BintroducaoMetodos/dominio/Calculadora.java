package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumero(){
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double dividiDoisNumeros(double num1, double num2){
        return num1/num2;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(num1/num2);
    }


    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);
    }

    public void somaArray(int[] numeros){
        int soma =0;
        for(int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs (int... numeros) {
        int soma =0;
        for(int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
