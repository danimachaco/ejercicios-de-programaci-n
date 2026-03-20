package ej_05;

import java.util.Scanner;

public class main {

    public static int factorial(int n){

        if (n<=1) {
            return 1;
        }

        return n * factorial(n-1);

    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero de la objetivo");
        int n=sc.nextInt();

        System.out.println("Factorial: "+factorial(n));

    }
}
