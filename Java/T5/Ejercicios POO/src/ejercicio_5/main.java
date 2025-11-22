package ejercicio_5;

public class main {
    public static void main(String[] args) {
    empleado objempleado = new empleado();
    objempleado.setNombre("Juan");
    objempleado.setSueldo(1000);

    objempleado.aplicarIncremento(10);

    objempleado.mostrarDatos();
    }
}
