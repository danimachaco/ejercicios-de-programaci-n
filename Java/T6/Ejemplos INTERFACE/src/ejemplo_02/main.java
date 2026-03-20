package ejemplo_02;

public class main {
    public static void main(String[] args) {
        vehiculo objcoche=new coche("citroen");
        vehiculo objbicicleta=new bicicleta("tuputamadre");

        objcoche.mover();
        objcoche.info();
        objbicicleta.mover();
        objbicicleta.info();


    }
}
