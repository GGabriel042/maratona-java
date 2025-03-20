package Exercicios.DataTypes06.test;

import java.util.Calendar;

public class CalendarExercise01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, 3);
        calendar.set(Calendar.DAY_OF_MONTH, 20);

        System.out.println("Dia: "+calendar.get(Calendar.DAY_OF_MONTH)+ " mes: "+calendar.get(Calendar.MONTH)+
                " ano: "+calendar.get(Calendar.YEAR));
    }
}
