package ejercicio_6;

public class notificacion {
    String mensaje;

    public notificacion(String mensaje) {
        this.mensaje = mensaje;
    }
    public void enviar(){
        System.out.println("Enviando notificación genérica: "+mensaje);
    }
    public void enviar(String remitente){
        System.out.println("Enviando notificación genérica de "+ remitente +": "+ mensaje);
    }
    public void enviar(boolean urgente){
        if(urgente==true){
            System.out.println("Enviando NOTIFICACIÓN URGENTE: "+mensaje);
        }
        else{
            System.out.println("Enviando notificación normal: "+mensaje);
        }
    }
}
