package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TrianguloRectanguloTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void cuadradoArea() {
        LOG.info("Iniciando test cuadradoArea");
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(10.0,20.0);

        assertEquals(100.0, trianguloRectangulo.calcularArea(), 100.0);

        LOG.info("Finalizando test cuadradoArea");    
    }
    @Test
    public void testCrearRectanguloConLadosNegativos() {
        LOG.info("Iniciando test CuadradoConLadosNegativos");

        assertThrows(IllegalArgumentException.class, () -> {
            TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(-10.0,20.0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(10.0,-20.0);

        LOG.info("Finalizando test CuadradoConLadosNegativos");
        });  

    }
}        
