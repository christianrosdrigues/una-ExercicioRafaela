import java.util.HashSet;

public class AlunosPresentes {
    public static void main(String[] args) {
        HashSet<String> presentes = new HashSet<>();

        presentes.add("Ana");
        presentes.add("Carlos");
        presentes.add("Bianca");
        presentes.add("Ana");
        presentes.add("Carlos");
        presentes.add("João");

        System.out.println("Alunos presentes sem repetição:");
        for (String aluno : presentes) {
            System.out.println(aluno);
        }

        System.out.println("Quantidade de alunos presentes: " + presentes.size());
    }
}