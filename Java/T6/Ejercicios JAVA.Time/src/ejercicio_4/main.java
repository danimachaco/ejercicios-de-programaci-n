package ejercicio_4;

import java.time.LocalDate;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        String dia = fecha.substring(0,2);
        String mes = fecha.substring(3,5);
        String anio = fecha.substring(6,10);

        int diaInt = Integer.parseInt(dia);
        int mesInt = Integer.parseInt(mes);
        int anioInt = Integer.parseInt(anio);

        LocalDate fecha2 = LocalDate.of(anioInt,mesInt,diaInt);
        LocalDate fecha3 = LocalDate.now();

        System.out.println(String.format("La fecha introducida es: "+ "%d"+ " "+ "%d"+" "+"%d", diaInt , mesInt, anioInt));

        if (fecha2.equals(fecha3)) {
            System.out.println("La fecha es correcta");
        }
        else {
            System.out.println("La fecha es incorrecta");
        }
    }
}
