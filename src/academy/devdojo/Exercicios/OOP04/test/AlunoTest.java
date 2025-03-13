package Exercicios.OOP04.test;

import Exercicios.OOP04.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gabriel", "15269", new double[]{10, 9, 9, 10});
        Aluno aluno2 = new Aluno("Rafael", "15268", new double[]{6, 7, 5, 6});
        Aluno aluno3 = new Aluno("Daniel", "15270", new double[]{6, 8, 2, 5});

        aluno1.imrpime();
        aluno2.imrpime();
        aluno3.imrpime();
    }
}
