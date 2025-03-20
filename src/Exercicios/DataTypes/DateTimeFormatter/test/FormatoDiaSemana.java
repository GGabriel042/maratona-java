package Exercicios.DataTypes.DateTimeFormatter.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatoDiaSemana {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'às' HH:mm:ss", new Locale("pt", "BR"));
        System.out.println("Data e hora formatadas: " + agora.format(formatter));
    }
}
