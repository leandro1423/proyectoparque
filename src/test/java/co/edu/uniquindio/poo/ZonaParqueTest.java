package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZonaParqueTest {
    private static final Logger LOG = Logger.getLogger(ZonaParqueTest.class.getName());

    @Test
    public void validarZonaCircular() {
        LOG.info("Iniciando Test de ValidarZona");

        double radio = 10.0;
        Material material = Material.ARENA;
        Zona zona = new Zona("Zona 1", new Circulo(radio), material);

        double areaEsperada = Math.PI * radio * radio;
        double valorEsperado = areaEsperada * material.getValorMetroCuadrado();

        assertEquals("Zona 1", zona.getNombre());
        assertEquals(314.1592653589793, zona.calcularValor(), 3141592.6535897935);
        assertEquals(valorEsperado, zona.calcularValor(), 0.01);

        LOG.info("Finalizando Test de ValidarZona");
    }

    @Test
    public void validarZonaRectangular(){
        LOG.info("iniciando Test de validarZona");

        double ancho = 10.0;
        double alto = 20.0;
        Material material = Material.GRAMASINTETICA;
        Zona zona = new Zona("Zona 1",new Rectangulo(ancho, alto),material);

        double areaEsperada = ancho * alto;
        double valorEsperado = areaEsperada*material.getValorMetroCuadrado();

        assertEquals("Zona 1", zona.getNombre());
        assertEquals(200.0, zona.calcularValor(),7000000.0);
        assertEquals(valorEsperado, zona.calcularValor(),0.01);

        LOG.info("finalizando Test de validarZona");
    }

    @Test
    public void validarZonaCuadrada(){
        LOG.info("iniciando Test de validarZona");
        
        double lado1 = 10.0;
        double lado2 = 10.0;
        Material material = Material.GRAMANATURAL;
        Zona zona = new Zona("Zona 1",new Cuadrado(lado1, lado2),material);

        double areaEsperada = lado1*lado2;
        double valorEsperado = areaEsperada*material.getValorMetroCuadrado();

        assertEquals("Zona 1", zona.getNombre());
        assertEquals(100.0, zona.calcularValor(),2000000.0);
        assertEquals(valorEsperado, zona.calcularValor(),0.01);
    }
    
    @Test
    public void ValidarZonaTrianguloRectangulo(){
        LOG.info("iniciando Test de validarZona");

        double base = 10.0;
        double altura = 20.0;
        Material material = Material.ASFALTO;
        Zona zona = new Zona("Zona 1", new TrianguloRectangulo(base, altura), material);

        double areaEsperada = base*altura/2.0;
        double valorEsperado = areaEsperada*material.getValorMetroCuadrado();

        assertEquals("Zona 1", zona.getNombre());
        assertEquals(100.0, zona.calcularValor(),4000000.0);
        assertEquals(valorEsperado, zona.calcularValor(),0.01);
    }
}
