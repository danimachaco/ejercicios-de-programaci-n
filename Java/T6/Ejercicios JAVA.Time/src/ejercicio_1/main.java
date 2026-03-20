package ejercicio_1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(2007,10,25);
        Period period = Period.between(birthDate, today);
        System.out.println(period.getYears()+" años");
        System.out.println(period.getMonths()+" meses");
        System.out.println(period.getDays()+" dias");

    }
}
