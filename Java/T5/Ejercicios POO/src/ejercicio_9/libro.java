package ejercicio_9;

public class libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    public libro(){}
    public libro(String titulo, String autor, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = prestado;
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo() {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor() {
        this.autor = autor;
    }
    public boolean esPrestado() {
        this.prestado = false;
        return this.prestado;
    }
    public void setPrestado() {
        this.prestado = prestado;
    }


    public void prestar(){
        if (this.prestado == false){
            this.prestado = true;
            System.out.println("Esta libre");
        }
    }
    public void devolver(){
        if (this.prestado == true){
            this.prestado = false;
            System.out.println("Esta prestado");
        }
    }

    public void estado (){
        if (this.prestado == true){
            System.out.println("Esta disponible");
        }
        else {
            System.out.println("No esta disponible");
        }
    }

}

