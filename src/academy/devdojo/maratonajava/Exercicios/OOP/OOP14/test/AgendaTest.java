package Exercicios.OOP14.test;

import Exercicios.OOP14.dominio.Agenda;

public class AgendaTest {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarContato(12345, "Gabriel");
        agenda.adicionarContato(23456, "Rafael");
        agenda.adicionarContato(34567, "Donatello");
        agenda.adicionarContato(45678, "Michelangelo");

        agenda.mostrarAgenda();

        agenda.deletarContato(12345);
        agenda.deletarContato("Leonardo");
        agenda.editarContato("Rafael" ,"Mester Splinter", 98562);

        agenda.mostrarAgenda();

    }
}
