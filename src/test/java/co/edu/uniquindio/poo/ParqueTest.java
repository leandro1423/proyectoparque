package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParqueTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void testSobrecostoArmenia() {
        LOG.info("iniciando test de Sobrecosto");
        Parque parque = new Parque("Nombre del parque", "Descripción del parque", Municipio.ARMENIA);
        assertEquals(0.0, parque.getSobrecosto());
        LOG.info("finalizando test de Sobrecosto");
    }

    @Test
    public void testSobrecostoCalarca() {
        LOG.info("iniciando test de Sobrecosto");
        Parque parque = new Parque("Nombre del parque", "Descripción del parque", Municipio.CALARCA);
        assertEquals(10000.0, parque.getSobrecosto());
        LOG.info("finalizando test de Sobrecosto");
    }

    @Test
    public void testSobrecostoMontenegro() {
        LOG.info("iniciando test de Sobrecosto");
        Parque parque = new Parque("Nombre del parque", "Descripción del parque", Municipio.MONTENEGRO);
        assertEquals(20000.0, parque.getSobrecosto());
        LOG.info("finalizando test de Sobrecosto");
    }

    @Test
    public void TestSobreCostoQuimbaya() {
        LOG.info("iniciando test de Sobrecosto");
        Parque parque = new Parque("Nombre del parque", "Descripción del parque", Municipio.QUIMBAYA);
        assertEquals(30000.0, parque.getSobrecosto());
        LOG.info("finalizando test de Sobrecosto");
    }
    @Test
    public void testSobrecostoTebaida() {
        LOG.info("iniciando test de Sobrecosto");
        Parque parque = new Parque("Nombre del parque", "Descripción del parque", Municipio.TEBAIDA);
        assertEquals(15000.0, parque.getSobrecosto());
        LOG.info("finalizando test de Sobrecosto");
    }
    @Test
    public void testSobrecostoCircasia() {
        LOG.info("iniciando test de Sobrecosto");
        Parque parque = new Parque("Nombre del parque", "Descripción del parque", Municipio.CIRCASIA);
        assertEquals(18000.0, parque.getSobrecosto());
        LOG.info("finalizando test de Sobrecosto");
    }
    @Test
    public void testSobrecostoFilandia() {
        LOG.info("iniciando test de Sobrecosto");
        Parque parque = new Parque("Nombre del parque", "Descripción del parque", Municipio.FILANDIA);
        assertEquals(22000.0, parque.getSobrecosto());
        LOG.info("finalizando test de Sobrecosto");
    }
    @Test
    public void testSobrecostoGenova() {
        LOG.info("iniciando test de Sobrecosto");
        Parque parque = new Parque("Nombre del parque", "Descripción del parque", Municipio.GENOVA);
        assertEquals(70000.0, parque.getSobrecosto());
        LOG.info("finalizando test de Sobrecosto");
    }
    @Test
    public void testSobrecostoSalento() {
        LOG.info("iniciando test de Sobrecosto");
        Parque parque = new Parque("Nombre del parque", "Descripción del parque", Municipio.SALENTO);
        assertEquals(50000.0, parque.getSobrecosto());
        LOG.info("finalizando test de Sobrecosto");
    }
    @Test
    public void testSobrecostoPijao() {
        LOG.info("iniciando test de Sobrecosto");
        Parque parque = new Parque("Nombre del parque", "Descripción del parque", Municipio.PIJAO);
        assertEquals(40000.0, parque.getSobrecosto());
        LOG.info("finalizando test de Sobrecosto");
    }
    @Test
    public void testSobrecostoCordoba() {
        LOG.info("iniciando test de Sobrecosto");
        Parque parque = new Parque("Nombre del parque", "Descripción del parque", Municipio.CORDOBA);
        assertEquals(30000.0, parque.getSobrecosto());
        LOG.info("finalizando test de Sobrecosto");
    }
    @Test
    public void testSobrecostobuenaVista() {
        LOG.info("iniciando test de Sobrecosto");
        Parque parque = new Parque("Nombre del parque", "Descripción del parque", Municipio.BUENAVISTA);
        assertEquals(35000.0, parque.getSobrecosto());
        LOG.info("finalizando test de Sobrecosto");
    }
}
