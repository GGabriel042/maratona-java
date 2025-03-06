package academy.devdojo.maratonajava.introducao;

public class Aula04EstruturasCondicionais05Exercicios {
    public static void main(String[] args) {
        byte dia = 5;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Não é dia útil");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
