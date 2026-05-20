import java.util.ArrayList;
import java.util.Scanner;

class Pedido {
    int numero;
    String nomeCliente;
    String itemPedido;
    double valor;
    String status;

    public Pedido(int numero, String nomeCliente, String itemPedido, double valor) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.itemPedido = itemPedido;
        this.valor = valor;
        this.status = "PENDENTE";
    }
}

public class SistemaLanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n1 - Cadastrar pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar status de um pedido");
            System.out.println("4 - Buscar pedido pelo número");
            System.out.println("5 - Mostrar valor total dos pedidos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Número do pedido: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.print("Item pedido: ");
                    String item = scanner.nextLine();

                    System.out.print("Valor: ");
                    double valor = scanner.nextDouble();

                    pedidos.add(new Pedido(numero, nome, item, valor));
                    System.out.println("Pedido cadastrado com sucesso!");
                    break;

                case 2:
                    for (Pedido pedido : pedidos) {
                        System.out.println("Número: " + pedido.numero);
                        System.out.println("Cliente: " + pedido.nomeCliente);
                        System.out.println("Item: " + pedido.itemPedido);
                        System.out.println("Valor: R$ " + pedido.valor);
                        System.out.println("Status: " + pedido.status);
                        System.out.println("--------------------");
                    }
                    break;

                case 3:
                    System.out.print("Digite o número do pedido: ");
                    int numAtualizar = scanner.nextInt();
                    scanner.nextLine();

                    for (Pedido pedido : pedidos) {
                        if (pedido.numero == numAtualizar) {
                            System.out.print("Novo status PENDENTE / PREPARANDO / FINALIZADO: ");
                            String novoStatus = scanner.nextLine();

                            if (
                                novoStatus.equals("PENDENTE") ||
                                novoStatus.equals("PREPARANDO") ||
                                novoStatus.equals("FINALIZADO")
                            ) {
                                pedido.status = novoStatus;
                                System.out.println("Status atualizado!");
                            } else {
                                System.out.println("Status inválido.");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.print("Digite o número do pedido: ");
                    int numBusca = scanner.nextInt();

                    for (Pedido pedido : pedidos) {
                        if (pedido.numero == numBusca) {
                            System.out.println("Cliente: " + pedido.nomeCliente);
                            System.out.println("Item: " + pedido.itemPedido);
                            System.out.println("Valor: R$ " + pedido.valor);
                            System.out.println("Status: " + pedido.status);
                        }
                    }
                    break;

                case 5:
                    double total = 0;

                    for (Pedido pedido : pedidos) {
                        total += pedido.valor;
                    }

                    System.out.println("Valor total dos pedidos: R$ " + total);
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}