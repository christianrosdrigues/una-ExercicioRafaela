import java.util.HashMap;

public class CadastroAlunos {
    public static void main(String[] args) {
        HashMap<Integer, String> alunos = new HashMap<>();

        alunos.put(101, "Ana");
        alunos.put(102, "Carlos");
        alunos.put(103, "Bianca");

        int matriculaBusca = 102;

        System.out.println("Buscando aluno pela matrícula " + matriculaBusca + ":");
        System.out.println(alunos.get(matriculaBusca));

        int matriculaRemover = 101;

        alunos.remove(matriculaRemover);

        System.out.println("Alunos cadastrados após remoção:");
        for (Integer matricula : alunos.keySet()) {
            System.out.println("Matrícula: " + matricula + " - Nome: " + alunos.get(matricula));
        }
    }
}