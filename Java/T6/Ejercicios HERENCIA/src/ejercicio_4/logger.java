package ejercicio_4;

public class logger {
    public void log(String mensaje) {
        System.out.println(mensaje);
    }
    public void log(String mensaje, int nivel){
        switch(nivel){
            case 1:
                System.out.println("INFO");
                break;
            case 2:
                System.out.println("WARNING");
                break;
            case 3:
                System.out.println("ERROR");
                break;

            default:
                System.out.println("NUMERO NO VÁLIDO");
                break;
        }
    }
    public void log(String mensaje, int nivel, boolean guardarEnFichero) {
        if (guardarEnFichero==true){
            System.out.println("Guardando en fichero: " + mensaje);
        }
        else {
            System.out.println(mensaje);
        }
    }
}
