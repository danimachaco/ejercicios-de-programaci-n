package ejercicio_3;

public class main {
    public static void main(String[] args) {
    producto objProducto = new producto("balon",10.25,5);

    double precioFinal = objProducto.obtenerPrecio(5.75);
    System.out.println("ahora cuesta "+precioFinal);

    int stockFinal = objProducto.stock(4);
    System.out.println("queda "+stockFinal);

    objProducto.mostrarInformacion();
    }
}
