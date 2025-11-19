import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myobject = new Scanner(System.in);
        System.out.println("Dame un numero ");
        int numero = myobject.nextInt();
        int resultado = 0;
        for (int i = 1; i <= 10; i++) {
            resultado=numero*i;
            System.out.println(resultado);
        }
    }
}
