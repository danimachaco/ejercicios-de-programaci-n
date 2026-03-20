package ej_04;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int numero=0;
        boolean continuar=true;

        while(continuar){

            System.out.println("ingrese un numero");
            String entradaDato = sc.nextLine();

            try {
                numero = Integer.parseInt(entradaDato);
                continuar = false;

            } catch(NumberFormatException e) {

                continuar = true;
                System.err.println("El numero es incorrecto. Vuelve a intentarlo");
            }
        }
        System.out.println("El numero es: " + numero);
    }
}