package entregas;

public class EntregaEstadoDevolvido implements EntregaEstado {

    private EntregaEstadoDevolvido() {};
    private static EntregaEstadoDevolvido instance = new EntregaEstadoDevolvido();
    public static EntregaEstadoDevolvido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Devolvido";
    }
}
