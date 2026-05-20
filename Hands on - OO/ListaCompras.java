import java.util.ArrayList;

public class ListaCompras {
    public static void main(String[] args) {
        ArrayList<String> compras = new ArrayList<>();

        compras.add("1_arroz");
        compras.add("2_feijão");
        compras.add("3_carne");
        compras.add("4_suco");
        compras.add("5_farofa");
        System.out.println("produtos cadastrados: ");
        for (String produto : compras) {
            System.out.println(produto);

        }
        System.out.println("Quantidade total de produtos: " + compras.size());
    }
}