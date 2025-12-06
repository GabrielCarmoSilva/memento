package entregas;

public class EntregaEstadoEnviado implements EntregaEstado {

    private EntregaEstadoEnviado() {};
    private static EntregaEstadoEnviado instance = new EntregaEstadoEnviado();
    public static EntregaEstadoEnviado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Enviado";
    }
}
