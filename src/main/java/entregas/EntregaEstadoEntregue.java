package entregas;

public class EntregaEstadoEntregue implements EntregaEstado {

    private EntregaEstadoEntregue() {};
    private static EntregaEstadoEntregue instance = new EntregaEstadoEntregue();
    public static EntregaEstadoEntregue getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Entregue";
    }
}
