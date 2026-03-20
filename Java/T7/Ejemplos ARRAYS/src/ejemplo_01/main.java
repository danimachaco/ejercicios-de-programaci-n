package ejemplo_01;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        String[] ejemploarray = new String[7];
        //Asignar
        ejemploarray[0] = "lunes";
        ejemploarray[1] = "martes";
        ejemploarray[2] = "miercoles";
        ejemploarray[3] = "jueves";
        ejemploarray[4] = "viernes";
        ejemploarray[5] = "sabado";
        ejemploarray[6] = "domingo";

        //Acceder
        System.out.println(ejemploarray[0]);

        String[] diasemana2 = new String[]{"l","m","x","j","v","s","d"};
        System.out.println(diasemana2[0]);

        String[] diasemana3 = {"l","m","x","j","v","s","d"};
        System.out.println(diasemana3[6]);
    }
}
