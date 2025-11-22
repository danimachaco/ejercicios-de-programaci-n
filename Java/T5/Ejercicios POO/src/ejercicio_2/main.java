package ejercicio_2;

public class main {
    public static void main(String[] args) {
    persona objPersona = new persona("Daniel",18);
    boolean resultado = objPersona.mayorEdad(objPersona.getEdad());
    System.out.println(resultado);
    objPersona.mostrarInformacion();
    objPersona.setEdad(7);
    boolean resultado2 = objPersona.mayorEdad(objPersona.getEdad());
    System.out.println(resultado2);
    objPersona.mostrarInformacion();
    }
}
