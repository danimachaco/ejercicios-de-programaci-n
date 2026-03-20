package ejercicio_3;

public class producto {
    String nombre;
    double precio;

    public producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public void mostrarInfo(){
        System.out.println("Producto: "+nombre+", "+precio);
    }
}
