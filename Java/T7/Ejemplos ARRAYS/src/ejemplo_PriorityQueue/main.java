package ejemplo_PriorityQueue;

import java.util.PriorityQueue;

public class main {
    public static void main(String[] args) {

        PriorityQueue<Integer> lista = new PriorityQueue<>();

        lista.offer(30);
        lista.offer(2);
        lista.offer(40);
        lista.offer(1);

        System.out.println(lista);
        System.out.println("Primera posicion: " + lista.peek());

        while(!lista.isEmpty()){
            System.out.println("Eliminando en orden de añadido: " + lista.poll());
        }

        System.out.println(lista);
    }
}
