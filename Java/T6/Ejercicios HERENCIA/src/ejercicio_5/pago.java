package ejercicio_5;

public class pago {
    double cantidad;

    public pago(double cantidad) {
        this.cantidad = cantidad;
    }
    public void procesarpago(){
        System.out.println("Procesando pago genérico de "+cantidad+" euros");
    }
}
