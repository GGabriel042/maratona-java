package Exercicios.DataTypes06.test;

import java.util.Calendar;

public class CalendarExercise03 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println("Year: " + cal.getActualMaximum(Calendar.YEAR));
        System.out.println("Month: " + cal.getActualMaximum(Calendar.MONTH));
        System.out.println("Day: " + cal.getActualMaximum(Calendar.DATE));
        System.out.println("Hour: " + cal.getActualMaximum(Calendar.HOUR));
        System.out.println("Minute: " + cal.getActualMaximum(Calendar.MINUTE));
        System.out.println("-------------------");

        System.out.println("Year: " + cal.getActualMinimum(Calendar.YEAR));
        System.out.println("Month: " + cal.getActualMinimum(Calendar.MONTH));
        System.out.println("Day: " + cal.getActualMinimum(Calendar.DATE));
        System.out.println("Hour: " + cal.getActualMinimum(Calendar.HOUR));
        System.out.println("Minute: " + cal.getActualMinimum(Calendar.MINUTE));
    }
}
