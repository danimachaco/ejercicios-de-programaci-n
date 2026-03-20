package ejercicio_3;

public class main {
    public static void main(String[] args) {
        producto objproducto=new producto("pan",1.05);
        libro objlibro = new libro("la maté porque era mia",15.95,"Pirry");
        comida objcomida = new comida ("sopa castellana",5.95,"1-5-2026");

        objproducto.mostrarInfo();
        objlibro.mostrarInfo();
        objcomida.mostrarInfo();
    }
}
