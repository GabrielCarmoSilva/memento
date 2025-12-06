package entregas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class EntregaTest {

    @Test
    void deveArmazenarEstados() {
        Entrega entrega = new Entrega();
        entrega.setEstado(EntregaEstadoSeparado.getInstance());
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        assertEquals(2, entrega.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Entrega entrega = new Entrega();
        entrega.setEstado(EntregaEstadoSeparado.getInstance());
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        entrega.restauraEstado(0);
        assertEquals(EntregaEstadoSeparado.getInstance(), entrega.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Entrega entrega = new Entrega();
        entrega.setEstado(EntregaEstadoSeparado.getInstance());
        entrega.setEstado(EntregaEstadoEnviado.getInstance());
        entrega.setEstado(EntregaEstadoSaiuParaEntrega.getInstance());
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        entrega.restauraEstado(2);
        assertEquals(EntregaEstadoSaiuParaEntrega.getInstance(), entrega.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Entrega entrega = new Entrega();
            entrega.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Indice invalido", e.getMessage());
        }
    }
}
