package Exercicios.OOP19.test;

import Exercicios.OOP19.dominio.Calendario;
import Exercicios.OOP19.dominio.Meses;

public class CalendarioTest {
    public static void main(String[] args) {
        Calendario calendario = new Calendario();

        calendario.construirMeses("Janeiro", 31);
        calendario.construirMeses("Fevereiro", 28);
        calendario.construirMeses("Março", 31);
        calendario.construirMeses("Abril", 30);
        calendario.construirMeses("Maio", 31);
        calendario.construirMeses("Junho", 30);
        calendario.construirMeses("Julho", 31);
        calendario.construirMeses("Agosto", 31);
        calendario.construirMeses("Setembro", 30);
        calendario.construirMeses("Outubro", 31);
        calendario.construirMeses("Novembro", 30);
        calendario.construirMeses("Dezembro", 31);

        calendario.mostrarMes("Janeiro");
        calendario.mostrarMes("Fevereiro");
        calendario.mostrarMes("Novembro");
        calendario.mostrarMes("Dezembro");

        calendario.marcarFeriado("Janeiro", 5);
        calendario.marcarFeriado("Novembro", 11);
        calendario.marcarFeriado("Setembro", 7);

        calendario.conferirFeriado("Janeiro", 5);
        calendario.conferirFeriado("Janeiro", 6);

        calendario.calcularDistanciaDatas("Janeiro", 1, "Dezembro", 31);
    }
}
