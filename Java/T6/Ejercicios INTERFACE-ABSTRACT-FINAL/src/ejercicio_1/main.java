package ejercicio_1;

/**
 * Clase main
 * @author Daniel Rodriguez
 */

public class main {
    public static void main(String[] args) {
        encendible objlampara=new lampara();
        encendible objradio=new radio();

        objlampara.encender();
        objlampara.apagar();

        objradio.encender();
        objradio.apagar();
    }
}
