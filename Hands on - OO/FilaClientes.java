import java.util.LinkedList;
import java.util.Queue;

public class FilaClientes {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.add("Carlos");
        fila.add("Bianca");
        fila.add("João");
        fila.add("Marina");

        System.out.println("Próximo a ser atendido: " + fila.peek());

        System.out.println("Atendendo: " + fila.poll());
        System.out.println("Atendendo: " + fila.poll());

        System.out.println("Fila atualizada:");
        for (String cliente : fila) {
            System.out.println(cliente);
        }
    }
}