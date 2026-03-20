package ejercicio_5;

public class pagobizum extends pago{
    public pagobizum(double cantidad) {
        super(cantidad);
    }

    @Override
    public void procesarpago() {
        System.out.println("Procesando pago con Bizum de "+cantidad+" euros");
    }
}
