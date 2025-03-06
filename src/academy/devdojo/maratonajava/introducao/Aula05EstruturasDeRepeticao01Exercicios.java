package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasDeRepeticao01Exercicios {
    public static void main(String[] args) {

        for(int i = 0; i <= 1000000; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
