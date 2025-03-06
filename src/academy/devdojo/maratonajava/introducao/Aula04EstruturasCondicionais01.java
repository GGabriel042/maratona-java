package academy.devdojo.maratonajava.introducao;

public class Aula04EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 20;
        boolean isAutorizadoADirigir = idade >= 18;

        if (isAutorizadoADirigir) {
            System.out.println("Pode dirigir");
        }else {
            System.out.println("Não pode dirigir");
        }
    }
}
