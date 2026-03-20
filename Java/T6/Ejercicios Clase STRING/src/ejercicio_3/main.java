package ejercicio_3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("dame una palabra ");
    String palabra=sc.nextLine();
    int cont=0;
    for (int i=0;i<palabra.length();i++) {
        if (palabra.charAt(i)=='a'||palabra.charAt(i)=='A'||palabra.charAt(i)=='e'||palabra.charAt(i)=='i'||palabra.charAt(i)=='o'||palabra.charAt(i)=='u') {
            cont+=1;
        }
    }
    System.out.println("El numero de vocales es: "+cont);
    }
}
