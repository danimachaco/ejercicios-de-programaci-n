package ejercicio_2;

public class cuadrado extends figura {
    double lado;

    /**
     * Constructora
     * @param lado
     */
    public cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double area(){
        double resultado=lado*lado;
        System.out.println("area del cuadrado: "+resultado);
        return resultado;
    }
}
