package ejercicio_1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("dame una cadena de caracteres: ");
        String cadena1 = obj.nextLine();
        System.out.println("dame otra cadena de caracteres: ");
        String cadena2 = obj.nextLine();
        int longitud;
        if (cadena1.length() < cadena2.length()) {
            longitud = cadena1.length();
        }
        else {
            longitud = cadena2.length();
        }

        if (cadena1.equals(cadena2)){
            System.out.println("son iguales ");
        }
        else{
            for (int i=0;i<=longitud;i++){
                if (cadena1.charAt(i)!=cadena2.charAt(i)){
                    System.out.println("no coinciden en la posicion "+i);
                }
            }
        }
    }
}
