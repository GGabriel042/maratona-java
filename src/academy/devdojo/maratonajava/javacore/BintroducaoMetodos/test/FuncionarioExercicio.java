package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioExercicio {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Gabriel");
        funcionario.setIdade(26);
        funcionario.setSalarios(new double[]{3000, 5000, 20000});

        funcionario.imprimeDados();
    }
}
