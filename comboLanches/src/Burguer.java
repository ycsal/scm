public class Burguer extends Produto {
    private int gramas;

    // Construtor com todos os atributos
    public Burguer(String descricao, double preco, int gramas) {
        super(descricao, preco);
        this.gramas = gramas;
    }

    // Getters e setters
    public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }

    // Método para imprimir informações sobre o burguer (opcional)
    @Override
    public String toString() {
        return "Burguer{" +
                "descricao='" + getDescricao() + '\'' +
                ", preco=" + getPreco() +
                ", gramas=" + getGramas() +
                '}';
    }
}