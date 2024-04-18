package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CuadradoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void cuadradoArea() {
        LOG.info("Iniciando test cuadradoArea");
        Cuadrado cuadrado = new Cuadrado(10.0,10.0);

        assertEquals(100.0, cuadrado.calcularArea(), 0.001); // El área de un cuadrado de lado 1 es 1

        LOG.info("Finalizando test cuadradoArea");
    }
    @Test
    public void testCrearRectanguloConLadosNegativos() {
        LOG.info("Iniciando test CuadradoConLadosNegativos");

        assertThrows(IllegalArgumentException.class, () -> {
            Cuadrado cuadrado = new Cuadrado(10.0, -10.0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Cuadrado cuadrado = new Cuadrado(10.0, -10.0);
        });

        LOG.info("Finalizando test CuadradoConLadosNegativos");
    }
    
}