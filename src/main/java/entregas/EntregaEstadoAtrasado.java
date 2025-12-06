package entregas;

public class EntregaEstadoAtrasado implements EntregaEstado {

    private EntregaEstadoAtrasado() {};
    private static EntregaEstadoAtrasado instance = new EntregaEstadoAtrasado();
    public static EntregaEstadoAtrasado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Atrasado";
    }
}
