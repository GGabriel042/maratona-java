package Exercicios.OOP05.test;

import Exercicios.OOP05.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Gabriel", "estágiario", 3000);
        Funcionario funcionario2 = new Funcionario("Rafael", "gerente", 20000);
        Funcionario funcionario3 = new Funcionario("Daniel", "CEO", 3500000);

        funcionario1.imprime();
        funcionario2.imprime();
        funcionario3.imprime();
    }
}
