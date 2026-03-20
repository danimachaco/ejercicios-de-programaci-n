package ejercicio_2;

public class main {
    public static void main(String[] args) {
        String frase="Hola querido alumno";
        frase.indexOf("querido");
        System.out.println("Introduce una frase de tres palabras: "+ frase);
        System.out.println("Palabra central: "+ frase.substring(5,12));
    }
}
