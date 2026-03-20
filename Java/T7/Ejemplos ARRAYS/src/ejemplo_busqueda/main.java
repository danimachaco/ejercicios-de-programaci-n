package ejemplo_busqueda;

public class main {
    public static void main(String[] args) {

        int[] numeros ={1,2,3,4,5,6,7,8,9,10};
        int numerobuscado= 8;
        int posicion= BusquedaLineal(numeros,numerobuscado);
        int posicion2=BusquedaBinaria(numeros,numerobuscado);

        System.out.println(posicion);
        System.out.println(posicion2);

    }
    public static int BusquedaLineal(int[] array, int numeroBusqueda){

        for (int i = 0; i < array.length; i++){
            if (array[i] == numeroBusqueda){
                return i;
            }
        }
        return -1;
    }

    public static int BusquedaBinaria(int[] array, int numeroBusqueda){
        int inicio = 0;
        int fin = array.length-1;


        while (inicio <= fin){
            int medio = (inicio+fin)/2;
            if (array[medio] == numeroBusqueda){
                return medio;
            }
            else if (array[medio] < numeroBusqueda){
                inicio = medio+1;
            } else{
                fin = medio-1;
            }
        }

        return -1;
    }
}
