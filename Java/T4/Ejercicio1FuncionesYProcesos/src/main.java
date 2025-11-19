import java.util.Scanner;

public class main {
    public static int devolverdoble  (int variableNumero1){
        int doble = variableNumero1*2;
        return doble;
    }
    public static void main(String[] args) {
        Scanner mynumber = new Scanner(System.in);
        System.out.println("Dame un numero");
        int numero1= mynumber.nextInt();
        
        System.out.println(devolverdoble(numero1));

    }
}
