public class Sobremesa extends Produto {
    private String tamanho;

    // Construtor
    public Sobremesa(String descricao, double preco, String tamanho) {
        super(descricao, preco);
        this.tamanho = tamanho;
    }

    // Getters e setters
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    // Método toString para representação textual
    @Override
    public String toString() {
        return "Sobremesa{" +
                "descricao='" + getDescricao() + '\'' +
                ", preco=" + getPreco() +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}