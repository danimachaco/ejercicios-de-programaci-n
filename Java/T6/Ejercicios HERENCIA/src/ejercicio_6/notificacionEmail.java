package ejercicio_6;

public class notificacionEmail extends notificacion{

    public notificacionEmail(String mensaje) {
        super(mensaje);
    }
    public void enviar(){
        System.out.println("Enviando EMAIL: "+mensaje);
    }




}
