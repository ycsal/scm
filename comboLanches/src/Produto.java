public class Produto {
    private String descricao;
    private double preco;

    // Construtor para inicializar os atributos
    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    // Getters e setters para acessar e modificar os atributos
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método toString para representar o objeto como uma string
    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}