package ejercicio_5;

public class pagotarjeta extends pago{
    public pagotarjeta(double cantidad){
        super(cantidad);
    }
    public void pagoTarjeta(){
        System.out.println("Pago Tarjeta de "+cantidad+"euros");
    }

}
