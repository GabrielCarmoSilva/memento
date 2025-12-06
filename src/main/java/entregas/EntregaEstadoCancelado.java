package entregas;

public class EntregaEstadoCancelado implements EntregaEstado {

    private EntregaEstadoCancelado() {};
    private static EntregaEstadoCancelado instance = new EntregaEstadoCancelado();
    public static EntregaEstadoCancelado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Cancelado";
    }
}
