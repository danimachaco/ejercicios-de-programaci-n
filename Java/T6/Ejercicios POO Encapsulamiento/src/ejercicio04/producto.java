package ejercicio04;

public class producto {
    private double precio;

    public producto(double precio) {
        this.precio = precio;
    }
    public double getPrecioConIVA() {
        double resultado = this.precio+(this.precio*0.21);
        return resultado;
    }
}
