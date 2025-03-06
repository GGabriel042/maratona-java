package academy.devdojo.maratonajava.introducao;

public class Aula04EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 25;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria infatintil";
        } else if (idade > 15 && idade < 18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
