package academy.devdojo.maratonajava.javacore.Gassossiacao.test;

import academy.devdojo.maratonajava.javacore.Gassossiacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassossiacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Macedo", professores);

        escola.imprime();
    }
}
