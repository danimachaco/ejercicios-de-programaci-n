package ejercicio_4;

public class cilindro {
    private double radio;
    private double altura;

    public cilindro() {}
    public cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularVolumen(){
        double resultado = Math.PI*this.radio*this.radio*this.altura;
        return resultado;
    }

    public double calcularAreaLateral(){
        double resultado2 = 2*Math.PI*this.radio*this.altura;
        return resultado2;
    }

    public void mostrarInformacion(){
        System.out.println("RADIO: "+this.radio+" Altura: "+this.altura);
        System.out.println("Area: "+calcularAreaLateral());
        System.out.println("Volumen: "+calcularVolumen());
    }
}
