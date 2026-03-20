package ej_04;

import java.util.Scanner;

public class main {

    public static int digitos(int numero){

        if(numero<10){
            return numero;
        }
        return digitos(numero%10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        digitos(opcion);

    }
}
