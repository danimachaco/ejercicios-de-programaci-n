package ejercicio_4;

public class main {
    public static void main(String[] args) {
    cilindro objc1 = new cilindro(5.4,2.5);

    double volumen = objc1.calcularVolumen();
    double area = objc1.calcularAreaLateral();
    objc1.mostrarInformacion();
    }
}
