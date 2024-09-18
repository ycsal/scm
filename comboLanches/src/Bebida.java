public class Bebida extends Produto {
    private int ml;

    // Construtor
    public Bebida(String descricao, double preco, int ml) {
        super(descricao, preco);
        this.ml = ml;
    }

    // Getters e setters
    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    // Método toString para representação textual
    @Override
    public String toString() {
        return "Bebida{" +
                "descricao='" + getDescricao() + '\'' +
                ", preco=" + getPreco() +
                ", ml=" + ml +
                '}';
    }
}