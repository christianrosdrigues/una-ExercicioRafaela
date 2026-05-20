import java.util.ArrayList;

public class MediaNotas {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();

        notas.add(8.0);
        notas.add(7.5);
        notas.add(6.0);
        notas.add(9.0);

        double soma = 0;

        for (Double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.size();

        System.out.println("Média da turma: " + media);

        if (media >= 7) {
            System.out.println("A turma ficou com média maior ou igual a 7.");
        } else {
            System.out.println("A turma ficou com média menor que 7.");
        }
    }
}