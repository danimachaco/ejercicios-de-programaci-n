package ej_06;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("que quieres buscar");
        LinkedHashSet<String> historial = new LinkedHashSet<String>();

        String busqueda = sc.nextLine();
        String salir = "fin";

        while (!busqueda.equals(salir)) {

            historial.add(busqueda);
            busqueda = sc.nextLine();

        }

        System.out.println("Historial: ");

        for (String s : historial) {
            System.out.println(s);
        }
    }
}
