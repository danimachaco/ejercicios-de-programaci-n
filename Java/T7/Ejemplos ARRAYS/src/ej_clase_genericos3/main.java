package ej_clase_genericos3;
import java.util.ArrayList;
public class main {

    public static <V, V2> ArrayList<V> convertToArrayList(V[] array, V2 otroTipoDeDato){
        ArrayList<V> miLista = new ArrayList<>();
        // Con el tipo V voy a hacer, por ejemplo, lo que estaba haciendo antes
        for (V numero: array){
            miLista.add(numero);
        }
        // Y con el tipo V2, por ejemplo, simplemente voy a imprimirlo por pantalla
        System.out.println(otroTipoDeDato);
        return miLista;
    }

    public static void main(String[] args) {

        Integer[] numeros = new Integer[]{1,2,3,4,5};
        Double[] datos = new Double[]{1.1,2.2,3.3,4.4,5.5};
        String[] dias = new String[]{"kjhg","fgbhj"};

        ArrayList<Integer> lamadre = new ArrayList<>();
        ArrayList<Double> puta = new ArrayList<>();
        ArrayList<String> qtpario = new ArrayList<>();


        String entero = "hola";

        lamadre = convertToArrayList(numeros,entero);
        System.out.println(lamadre);

        puta = convertToArrayList(datos,entero);
        System.out.println(puta);

        qtpario = convertToArrayList(dias,entero);
        System.out.println(qtpario);

    }
}
