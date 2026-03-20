package ejemplo_clase;

public class main {
    public static void main(String[] args) {
        animal objAnimal1 = new animal("Rocky",4);
        System.out.println(objAnimal1.getNombre());
        objAnimal1.hacerSonido();
        perro objPerro = new perro("pastor aleman","pepe",8);
        objPerro.mostrarInfo();

        objPerro.hacerSonido();
    }
}