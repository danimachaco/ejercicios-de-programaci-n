package ejemplo_coche;

public class coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private String etiquetaEcologica;

    public coche() {

    }
    public coche(String marca, String modelo,  int velocidadMaxima, String etiquetaEcologica) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.etiquetaEcologica = etiquetaEcologica;
    }
    public coche(String marca, int velocidadMaxima, String etiquetaEcologica) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
        this.etiquetaEcologica = etiquetaEcologica;
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getEtiquetaEcologica() {
        return this.etiquetaEcologica;
    }
    public void setEtiquetaEcologica(String etiquetaEcologica) {
        this.etiquetaEcologica = etiquetaEcologica;
    }
    public void mostrarInformacion(){
        System.out.println("Marca: "+this.marca +" Modelo: " + this.modelo + " Etiqueta Ecologica: " + this.etiquetaEcologica);
    }
    public boolean comprobarZBE (String vEtiquetaEcologica) {
        boolean resultado = true;
        if (vEtiquetaEcologica.equals("0") || vEtiquetaEcologica.equals("ECO")) {
            resultado = true;
        }
        else  {
            resultado = false;
        }
        return resultado;
    }
    public int sobrepasarVelocidadMaxima (int pvelocidadMaxima) {
        int velocidadRecomendada=120;
        int resultadoVelocidad=pvelocidadMaxima-velocidadRecomendada;
        return resultadoVelocidad;
    }
    public void ejemploSinStatic(){
        System.out.println("Ejemplo Sin static");
    }
    public static void ejemploConStatic(){
        System.out.println("Ejemplo Con static");
    }
}

