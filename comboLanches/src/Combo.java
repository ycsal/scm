public class Combo {
    private Burguer burguer;
    private Sobremesa sobremesa;
    private Bebida bebida;

    // Método para criar um combo com base em um tipo
    public void criarCombo(int tipo) {
        switch (tipo) {
            case 1:
                burguer = new Burguer("X-Tudo", 15.99, 200);
                sobremesa = new Sobremesa("Sundae", 8.99, "Médio");
                bebida = new Bebida("Coca-Cola", 3.99, 500);
                break;
            case 2:
                burguer = new Burguer("X-Salada", 16.99, 200);
                sobremesa = new Sobremesa("Milkshake", 11.99, "Médio");
                bebida = new Bebida("Guaraná", 1.99, 300);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    // Método para exibir os itens do combo
    @Override
    public String toString() {
        return "Combo{" +
                "burguer=" + burguer +
                ", sobremesa=" + sobremesa +
                ", bebida=" + bebida +
                '}';
    }
}