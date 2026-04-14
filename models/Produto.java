public class Produto {

    // Atributos
    private String nome;
    private double preco;
    private int quantidade;
    private String categoria;

    // Construtor padrão
    public Produto() {
        this.nome = "Produto Genérico";
        this.preco = 0.0;
        this.quantidade = 0;
        this.categoria = "Sem categoria";
    }

    // Construtor parametrizado
    public Produto(String nome, double preco, int quantidade, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    // Métodos específicos
    public void adicionarEstoque(int qtd) {
        this.quantidade += qtd;
    }

    public void removerEstoque(int qtd) {
        if (qtd <= this.quantidade) {
            this.quantidade -= qtd;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}