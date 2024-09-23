public class Sobremesa extends Produto {
    private String tamanho;

    public Sobremesa(String descricao, double preco, String tamanho) {
        super(descricao, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Sobremesa: " + getDescricao() + "\n" +
               "Preco: R$" + getPreco() + "\n" +
               "Tamanho: " + getTamanho();
    }
}