public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString() {
        return nome + " - R$" + preco + " (Qtd: " + quantidade + ")";
    }
}
