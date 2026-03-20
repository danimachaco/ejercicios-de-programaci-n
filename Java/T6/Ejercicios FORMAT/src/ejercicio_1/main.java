package ejercicio_1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre=sc.nextLine();
        int edad=sc.nextInt();
        System.out.println(String.format("Hola, me llamo "+"%s"+"y tengo "+"%d",nombre,edad));
    }
}
