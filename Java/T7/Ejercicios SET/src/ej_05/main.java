package ej_05;

import java.util.HashSet;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce matriculas");
        HashSet<String> listamatriculas = new HashSet<String>();
        String matriculas = sc.nextLine();
        String salir = "fin";

        while (!matriculas.equals(salir)) {
            listamatriculas.add(matriculas);
            matriculas = sc.nextLine();
            if (listamatriculas.contains(matriculas)) {
                System.out.println("matricula registrada: " + matriculas);
            }
        }

        System.out.println("Total de coches unicos: " + listamatriculas.size());
    }
}
