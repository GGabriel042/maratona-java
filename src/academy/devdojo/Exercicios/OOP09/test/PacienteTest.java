package Exercicios.OOP09.test;

import Exercicios.OOP09.dominio.Paciente;

public class PacienteTest {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Gabriel", 26, new String[]{"Dentista", "Cadiologista", "Exame de sangue"});
        Paciente paciente2 = new Paciente("Rafael", 16, new String[]{"Oftamologo", "Exame de sangue"});
        Paciente paciente3 = new Paciente("Melissa", 28, new String[]{"Exame geral", "Ginecologista", "Exame de sangue"});

        paciente1.imprimeConsultas();
        paciente2.imprimeConsultas();
        paciente3.imprimeConsultas();

        paciente1.adicionarConsulta("Exame geral");
        paciente2.adicionarConsulta("Pediatra");
        paciente3.adicionarConsulta("Oftamologo");

        paciente1.imprimeConsultas();
        paciente2.imprimeConsultas();
        paciente3.imprimeConsultas();
    }
}
