package ejemplo_1;

public class main {
    public static void main(String[] args) {
        try{
            int x = 1;
            int y = 0;
            int resultado = x / y;
            System.out.println(resultado);
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
