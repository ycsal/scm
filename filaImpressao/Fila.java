public class Fila {
    private String documento = "Feito por: Arthur Duvareski e Yasmin Salgado";

    private static Fila instance;

    public static Fila getInstance() {
        if (instance == null){
            instance = new Fila();
        }
        return instance;
    }

    public void imprimeDocumento(){
        System.out.println("Imprimindo documento...");
    }
    
    public void removeDocumento(){
        System.out.println("Removendo documento...");
    }

    public void removeTodosDocumentos(){
        System.out.println("Removendo todos os documentos...");
    }
    
    private Fila(){

    }
}
