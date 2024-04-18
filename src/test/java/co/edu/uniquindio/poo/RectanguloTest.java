package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectanguloTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void RectanguloArea() {
        LOG.info("Iniciando test Rectangulo");
        Rectangulo rectangulo = new Rectangulo(10.0,20.0);

        assertEquals(200.0, rectangulo.calcularArea(), 0.001);

        LOG.info("Finalizando test Rectangulo");
    }
    @Test
    public void testCrearRectanguloConLadosNegativos() {
        LOG.info("Iniciando test testCrearRectanguloConLadosNegativos");

        assertThrows(IllegalArgumentException.class, () -> {
            Rectangulo rectangulo = new Rectangulo(-10.0, 20.0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Rectangulo rectangulo = new Rectangulo(10.0, -20.0);
        });

        LOG.info("Finalizando test testCrearRectanguloConLadosNegativos");
    }
    
}    
