package ejercicio_1;

public class main {
    public static void main(String[] args) {
        instrumento objInstrumento = new instrumento("pepa","viento");
        guitarra objGuitarra= new guitarra(6,"pirry","cuerda");
        tambor objTambor=new tambor(6.5,"leo","percusion");

        objInstrumento.tocar();
        objGuitarra.tocar();
        objTambor.tocar();
    }
}
