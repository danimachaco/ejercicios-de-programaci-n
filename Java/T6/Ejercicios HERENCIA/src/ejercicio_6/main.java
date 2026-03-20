package ejercicio_6;

public class main {
    public static void main(String[] args) {
        notificacion objnotificacion =new  notificacion("pirry");
        objnotificacion.enviar();
        notificacionEmail objnotificacionEmail = new  notificacionEmail("asier");
        objnotificacionEmail.enviar();
        notificacionSMS objnotificacionSMS = new  notificacionSMS("hijoputas");
        objnotificacionSMS.enviar();

        notificacion objnotificacion2 =new  notificacion("pirryyyyyy");
        notificacion objnotificacion3 =new  notificacion("asierrrrrr");

        notificacionEmail objnotificacionEmail2 = new  notificacionEmail("asier");
        notificacionEmail objnotificacionEmail3= new  notificacionEmail("raul");

        notificacionSMS objnotificacionSMS2 = new  notificacionSMS("hijoputas");
        notificacionSMS objnotificacionSMS3 = new  notificacionSMS("hijoputas");


        objnotificacion2.enviar("yo");
        objnotificacionEmail2.enviar();
        objnotificacionSMS2.enviar();
        objnotificacion3.enviar(true);
        objnotificacionEmail3.enviar();
        objnotificacionSMS3.enviar();
    }
}
