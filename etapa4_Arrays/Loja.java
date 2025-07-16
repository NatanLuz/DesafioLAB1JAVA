public class Loja {
    protected String nome;
    protected Endereco endereco;
    protected Produto[] estoqueProdutos;

    public Loja(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.estoqueProdutos = new Produto[50]; // capacidade 
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].toString().contains(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Loja: ").append(nome).append("\n");
        sb.append("Endereço: ").append(endereco.toString()).append("\n");
        sb.append("Produtos:\n");
        for (Produto p : estoqueProdutos) {
            if (p != null) sb.append("- ").append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}
