package ejercicio_5;

public class main {
    public static void main(String[] args) {
        programable objlavadora=new lavadora();
        programable objmicroondas=new microondas();

        objlavadora.iniciarPrograma(45);
        objlavadora.detenerPrograma();
        objlavadora.enFuncionamiento();

        objmicroondas.iniciarPrograma(3);
        objmicroondas.detenerPrograma();
        objmicroondas.enFuncionamiento();
    }
}
