import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myobject= new Scanner(System.in);
        System.out.println("¿Cuantos años tienes? :");
        int edad =myobject.nextInt();
        if (edad>=18){
            System.out.println("eres mayor de edad");
        }
        else {
            System.out.println("eres menor de edad");
        }
    }
}
