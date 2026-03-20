package ejemplo_01;

public class main {
    public static void main(String[] args) {
        encendible objlampara=new lampara();
        encendible objordenador=new ordenador();

        objlampara.encender();
        objordenador.encender();

        objlampara.apagar();
        objordenador.apagar();
    }
}
