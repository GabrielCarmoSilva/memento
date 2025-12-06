package entregas;

public class EntregaEstadoPago implements EntregaEstado {

    private EntregaEstadoPago() {};
    private static EntregaEstadoPago instance = new EntregaEstadoPago();
    public static EntregaEstadoPago getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pago";
    }
}
