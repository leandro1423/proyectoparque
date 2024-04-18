package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CirculoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void circuloRadioPositivo() {
        LOG.info("Iniciando test circuloRadioArea");
        Circulo circulo = new Circulo(10);

        assertEquals(314.159, circulo.calcularArea(), 0.001);

        LOG.info("Finalizando test circuloRadioArea");

    }

    @Test
    public void testCrearRectanguloConLadosNegativos() {
        LOG.info("Iniciando test RadioNegativo");

        assertThrows(IllegalArgumentException.class, () -> {
            Circulo circulo = new Circulo(-10.0);
        });


        LOG.info("Finalizando test RadioNegativo");
    }

}
