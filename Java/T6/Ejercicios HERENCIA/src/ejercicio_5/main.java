package ejercicio_5;

public class main {
    public static void main(String[] args) {
        pago objpago=new pago(50.3);
        pagopaypal objpagop=new pagopaypal(100);
        pagobizum objpagob=new pagobizum(20);
        pagotarjeta objpagot=new pagotarjeta(75.3);

        objpago.procesarpago();
        objpagop.procesarpago();
        objpagob.procesarpago();
        objpagot.procesarpago();

    }
}
