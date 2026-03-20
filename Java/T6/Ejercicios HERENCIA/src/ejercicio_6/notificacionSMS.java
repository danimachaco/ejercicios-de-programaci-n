package ejercicio_6;

public class notificacionSMS extends notificacion{


    public notificacionSMS(String mensaje){
        super(mensaje);
    }
    public void enviar(){
        System.out.println("Enviando SMS: "+mensaje);
    }

}
