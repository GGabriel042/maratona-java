package academy.devdojo.maratonajava.javacore.Gassossiacao.test;

import academy.devdojo.maratonajava.javacore.Gassossiacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassossiacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassossiacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassossiacao.dominio.Seminario;

public class Exercicio01 {
    public static void main(String[] args) {
        Local local = new Local("Rio de Janeiro");
        Aluno aluno = new Aluno("Gabriel", 26);
        Aluno aluno2 = new Aluno("Gonzaga", 28);
        Professor professor = new Professor("Joao", "Java");
        Aluno[] alunosSeminario = {aluno, aluno2};
        Seminario seminario = new Seminario("Prova Tecnica", alunosSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
