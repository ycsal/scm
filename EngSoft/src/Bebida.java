public class Bebida extends Produto {
    private int ml;

    public Bebida(String descricao, double preco, int ml) {
        super(descricao, preco);
        this.ml = ml;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    @Override
    public String toString() {
        return "Bebida: " + getDescricao() + "\n" +
               "Preco: R$" + getPreco() + "\n" +
               "Tamanho: " + getMl() + "ml";
    }
}