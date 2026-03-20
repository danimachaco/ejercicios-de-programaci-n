package ejemplo_05;

import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        String [] arrayEjemplo = {"L","M","X","J","V","S","D"};
        int posicion = 2;
        System.out.println("Array original: " + Arrays.toString(arrayEjemplo));
        arrayEjemplo= eliminarElemento(arrayEjemplo, posicion);
        System.out.println("Array quitando un elemento: " + Arrays.toString(arrayEjemplo));
    }

    public static String[] eliminarElemento (String[] array, int posicion){
        String [] nuevoArray= new String[array.length-2];
        System.arraycopy(array, 0, nuevoArray, 0, posicion);
        System.arraycopy(array, posicion+2, nuevoArray, posicion, nuevoArray.length-posicion);
        return nuevoArray;
    }
}
