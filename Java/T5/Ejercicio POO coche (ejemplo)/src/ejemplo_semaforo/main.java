package ejemplo_semaforo;

public class main {
    public static void main(String[] args) {
    semaforo objSemaforo = new semaforo("v");
    String resultado = objSemaforo.cambiarColor(objSemaforo.getColor());
    System.out.println(resultado);
    }
}
