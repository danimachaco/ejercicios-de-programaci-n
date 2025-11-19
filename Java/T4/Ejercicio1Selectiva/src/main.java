import java.util.Scanner;

public class main {
    static public void  main(String args[]) {
        Scanner myobject = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int numero1 = myobject.nextInt();
        if (numero1>100) {
            System.out.println("Numero grande");
        }
    }
}

