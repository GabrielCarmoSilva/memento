package entregas;

public class EntregaEstadoSaiuParaEntrega implements EntregaEstado {

    private EntregaEstadoSaiuParaEntrega() {};
    private static EntregaEstadoSaiuParaEntrega instance = new EntregaEstadoSaiuParaEntrega();
    public static EntregaEstadoSaiuParaEntrega getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Saiu Para Entrega";
    }
}
