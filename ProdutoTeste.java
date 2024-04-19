package Produto;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Caneta", 1.5);
        Produto produto2 = new Produto("Caderno", 5.0);

        System.out.println("Preço total da " + produto1.getNome() + ": " + produto1.calcularPrecoTotal());
        System.out.println("Preço total do " + produto2.getNome() + ": " + produto2.calcularPrecoTotal());

        int quantidadeProduto1 = 3;
        int quantidadeProduto2 = 2;

        System.out.println("Preço total de " + quantidadeProduto1 + " unidades de " + produto1.getNome() + ": " + produto1.calcularPrecoTotal(quantidadeProduto1));
        System.out.println("Preço total de " + quantidadeProduto2 + " unidades de " + produto2.getNome() + ": " + produto2.calcularPrecoTotal(quantidadeProduto2));
    }
}
