package ejercicio_5;

public class pagopaypal extends pago{
    public pagopaypal(double cantidad){
        super(cantidad);
    }

    @Override
    public void procesarpago() {
        System.out.println("Procesando pago con PayPal de "+cantidad+" euros");
    }
}
