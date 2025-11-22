package ejemplo_coche;

public class main {
    public static void main(String[] args) {
    coche objCoche1  = new coche("AUDI",250,"B");
    objCoche1.setModelo("A4");
    objCoche1.mostrarInformacion();
    boolean eresultado = objCoche1.comprobarZBE(objCoche1.getEtiquetaEcologica());
    System.out.println("Puede circular por la ZBE? "+eresultado);
    int vresultado = objCoche1.sobrepasarVelocidadMaxima(objCoche1.getVelocidadMaxima());
    System.out.println("Supera la velocidad en "+vresultado+" km/h");

    coche objCoche2 = new coche("DACIA","Sandero",110,"ECO");
    objCoche2.mostrarInformacion();
    boolean eresultado2 = objCoche2.comprobarZBE(objCoche2.getEtiquetaEcologica());
    System.out.println("Puede circular por la ZBE? "+eresultado2);
    int vresultado2 = objCoche2.sobrepasarVelocidadMaxima(objCoche2.getVelocidadMaxima());
    System.out.println("Al ir "+vresultado2+" km/h por debajo de la máxima, va a una velocidad correcta");
    objCoche1.ejemploSinStatic();
    coche.ejemploConStatic();
    }
}
