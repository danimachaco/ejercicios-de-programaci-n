import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int numero=0;
        int resultadomes=5 ;
        for (int i = 1; i <= 12; i++) {
            numero=numero+resultadomes;
            resultadomes=resultadomes*2;
        }
        System.out.println(numero);
    }
}
