package Produto;

public class Produto {
    private String nome;
    private double precoUnitario;

    public Produto(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    // Método para calcular o preço total para uma única unidade do produto
    public double calcularPrecoTotal() {
        return precoUnitario;
    }

    // Método sobrecarregado para calcular o preço total para várias unidades do produto
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
