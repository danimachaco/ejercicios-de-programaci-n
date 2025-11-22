package ejercicio_3;

public class producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public producto() {}
    public producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double obtenerPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        return nuevoPrecio;
    }
    public int stock(int cantidadVendida) {
        int resultado = this.cantidad - cantidadVendida;
        this.cantidad = resultado;
        if (resultado >=this.cantidad) {
            System.out.println("Hay stock");
        }
        else if (resultado<=0) {
            System.out.println("No hay stock");
        }
        return resultado;
    }
    public void mostrarInformacion() {
        System.out.println(this.nombre + " " +  this.precio + " " + this.cantidad);
    }
}
