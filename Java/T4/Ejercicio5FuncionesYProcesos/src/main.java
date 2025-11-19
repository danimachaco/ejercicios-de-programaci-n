import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        int numero = sc.nextInt();
        tablamultiplicar(numero);
    }
    public static void tablamultiplicar(int variableNumero){
        int resultado=1;
        for (int i = 1; i <= 10; i++) {
            resultado=variableNumero*i;
            System.out.println(variableNumero+"+"+i+"="+resultado);
        }

    }


}
