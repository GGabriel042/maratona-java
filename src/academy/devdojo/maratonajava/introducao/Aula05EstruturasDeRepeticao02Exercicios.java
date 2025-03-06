package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasDeRepeticao02Exercicios {
    public static void main(String[] args) {

        int valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+ parcela+ " de R$ "+valorParcela);
        }
    }
}
