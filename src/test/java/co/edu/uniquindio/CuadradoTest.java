package co.edu.uniquindio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import co.edu.uniquindio.poo.AppTest;
import co.edu.uniquindio.poo.Cuadrado;

public class CuadradoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void cuadradoArea() {
        LOG.info("Iniciando test cuadradoArea");
        Cuadrado cuadrado = new Cuadrado(10.0,10.0);

        assertEquals(10.0, cuadrado.calcularArea(), 0.001); // El área de un cuadrado de lado 1 es 1

        LOG.info("Finalizando test cuadradoArea");
    }
}
