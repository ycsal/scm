public class Main {
    public static void main(String[] args) {
        Fila fila = Fila.getInstance();
        fila.imprimeDocumento();
        fila.removeDocumento();
        fila.imprimeDocumento();
        fila.removeTodosDocumentos();
    }
}
