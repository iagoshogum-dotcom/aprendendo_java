import model.Produto;

public class Loja {
    public static void main(String[] args) {
        Produto produto1 = new Produto("erva",3.00,5,"3cm");
        Produto produto2 = new Produto("maconha", 8.00,8,"10cm");

        System.out.println("Estoque produto 1");
        produto1.mostrarEstoque();
        System.out.println("=".repeat(25));
        System.out.println("Estoque produto 2");
        produto2.mostrarEstoque();

        int retornoEstoque = produto1.adicionarEstoque(5);

        System.out.println("=".repeat(25));
        System.out.println("Estoque produto 1 Atualizado");
        produto1.mostrarEstoque();
    }
}
