package ejemplo_1;

public class MaquinaContadora {
    private int inicio;
    private int fin;

    public MaquinaContadora(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    public int getInicio() {
        return inicio;
    }
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    public int getFin() {
        return fin;
    }
    public void setFin(int fin) {
        this.fin = fin;
    }

    public void contar(){
        this.inicio=inicio;
        this.fin=fin;
        for(int i=this.inicio;i<=this.fin;i++){
            if (i % 2==0){
                System.out.println("par: "+i);
            }
            else{
                System.out.println("imp: "+i);
            }
        }
    }
    public static void main(String[] args) {
        MaquinaContadora obj = new MaquinaContadora (1 ,  10);
        obj.contar();
    }
}

