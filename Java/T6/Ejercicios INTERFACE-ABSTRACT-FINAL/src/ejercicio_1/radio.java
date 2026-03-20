package ejercicio_1;

public class radio implements encendible {
    @Override
    public void encender() {
        System.out.println("encender radio");
    }
    @Override
    public void apagar() {
        System.out.println("apagar radio");
    }
}
