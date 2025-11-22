package ejemplo_semaforo;

public class semaforo {
    private String color;

    public semaforo() {}
    public semaforo(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String cambiarColor(String vcolor) {
        if (vcolor.equals("r")) {
            color = "amarillo";
        }
        else if (vcolor.equals("a")) {
            color = "verde";
        }
        else if (vcolor.equals("v")) {
            color = "rojo";
        }
        return color;
    }
}
