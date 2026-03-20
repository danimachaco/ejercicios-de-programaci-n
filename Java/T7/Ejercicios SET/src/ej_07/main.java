package ej_07;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("que canciones quieres");
        LinkedHashSet<String> listarepro = new LinkedHashSet<String>();

        String cancion = sc.nextLine();
        String salir = "fin";

        while (!cancion.equals(salir)) {

            listarepro.add(cancion);
            cancion = sc.nextLine();

        }

        System.out.println("Lista de reproducción: ");

        for (String s : listarepro) {
            System.out.println(s);
        }

    }
}
