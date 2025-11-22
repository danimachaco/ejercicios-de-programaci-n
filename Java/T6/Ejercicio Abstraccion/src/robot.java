public class robot {
    private String nombre;
    private int nivelEnergia;
    private String modo;

    public robot() {}
    public robot(String nombre, int nivelEnergia, String modo) {
        this.nombre = nombre;
        this.nivelEnergia = nivelEnergia;
        this.modo = modo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre() {
        this.nombre = nombre;
    }
    public int getNivelEnergia() {
        return nivelEnergia;
    }
    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }
    public String getModo() {
        return modo;
    }
    public void setModo(String modo) {
        this.modo = modo;
    }

    public void moverse(){
        if (nivelEnergia > 20){
            System.out.println("Estoy listo para la aventura" + " " + "Nivel de bateria: " + this.nivelEnergia + "%");
        }
        else if (this.nivelEnergia ==20){
            System.out.println("Houston, tenemos un problema, necesito descansar");
            System.out.println("Activando modo " +  this.modo);
        }
        else if (this.nivelEnergia == 0){
            System.out.println("Apagando sistema");
            cargar();
        }
    }
    public void cargar(){
        do {
            int contador = this.nivelEnergia + 5;
            if (this.nivelEnergia <= 20){
                System.out.println("Cargando..." + "," + contador);
            }
        }
        while (this.nivelEnergia == 100);
    }
    public void mostrarIndformacion(){
        System.out.println("Nombre: " + this.nombre+" "+  "Bateria: " + this.nivelEnergia+" "+  "Modo: " + this.modo);
    }
}
