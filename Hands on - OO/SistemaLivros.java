import java.util.ArrayList;
import java.util.Scanner;

class Livro {
    int codigo;
    String titulo;
    String autor;
    boolean disponivel;

    public Livro(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }
}

public class SistemaLivros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    livros.add(new Livro(codigo, titulo, autor));
                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 2:
                    for (Livro livro : livros) {
                        System.out.println("Código: " + livro.codigo);
                        System.out.println("Título: " + livro.titulo);
                        System.out.println("Autor: " + livro.autor);
                        System.out.println("Disponível: " + livro.disponivel);
                        System.out.println("--------------------");
                    }
                    break;

                case 3:
                    System.out.print("Digite o código do livro: ");
                    int codEmprestar = scanner.nextInt();

                    for (Livro livro : livros) {
                        if (livro.codigo == codEmprestar) {
                            if (livro.disponivel) {
                                livro.disponivel = false;
                                System.out.println("Livro emprestado com sucesso!");
                            } else {
                                System.out.println("Livro indisponível.");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.print("Digite o código do livro: ");
                    int codDevolver = scanner.nextInt();

                    for (Livro livro : livros) {
                        if (livro.codigo == codDevolver) {
                            livro.disponivel = true;
                            System.out.println("Livro devolvido com sucesso!");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}
