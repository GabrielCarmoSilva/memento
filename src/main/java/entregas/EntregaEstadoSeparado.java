package entregas;

public class EntregaEstadoSeparado implements EntregaEstado {

    private EntregaEstadoSeparado() {};
    private static EntregaEstadoSeparado instance = new EntregaEstadoSeparado();
    public static EntregaEstadoSeparado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Separado";
    }
}
