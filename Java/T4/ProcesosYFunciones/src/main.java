public class main {
    public static void procedimiento(String otravariable){
        System.out.println(otravariable);
    }

    public static String funciones(){
        String resultado = "Paso de variable";
        return resultado;
    }



    public static void main(String[] args) {
        String variable= "Paso a variable";
        procedimiento(variable);
        String valor= funciones();
        System.out.println(valor);
    }
}
