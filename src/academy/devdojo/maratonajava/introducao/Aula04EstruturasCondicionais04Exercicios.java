package academy.devdojo.maratonajava.introducao;

public class Aula04EstruturasCondicionais04Exercicios {
    public static void main(String[] args) {

        float salario = 25000f;
        float salarioFinal;
        float tax;

        if (salario < 34712) {
            tax = 9.70f;
            salarioFinal = salario - (salario * (tax / 100));
        } else if (salario > 34713 && salario < 68507) {
            tax = 37.35f;
            salarioFinal = salario - (salario * (tax / 100));
        } else {
            tax = 49.50f;
            salarioFinal = salario - (salario * (tax / 100));
        }

        float valorImposto = salario - salarioFinal;
        System.out.println(valorImposto);
    }
}
