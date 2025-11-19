import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner dato1 = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int numero = dato1.nextInt();
        System.out.print(parimpar(numero));

    }
    public static boolean parimpar(int variableNumero){
        if (variableNumero%2==0){
            return true;
        }
        else {
            return false;
        }
    }

}
