package ejercicio_4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("dame una frase ");
        String frase = sc.nextLine();
        System.out.println("frase : "+frase);
        System.out.print("dame una palabra prohibida de la frase ");
        String palabra = sc.nextLine();
        System.out.println("palabra prohibida: "+palabra);

        if (palabra.equals(frase)){
            
        }
    }
}
