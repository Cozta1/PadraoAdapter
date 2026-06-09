package test.java;

import main.java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerTest {

    @Test
    void deveRetornarConceitoHamburguer() {
        Hamburguer hamburguer = new Hamburguer();
        hamburguer.setAvaliacao("EXCELENTE");

        assertEquals("EXCELENTE", hamburguer.getAvaliacao());
    }

    @Test
    void deveRetornarNotaHamburguer() {
        Hamburguer hamburguer = new Hamburguer();
        hamburguer.setAvaliacao("EXCELENTE");

        assertEquals(9.0f, hamburguer.getNota());
    }

    @Test
    void deveConverterConceitoBomParaNotaOito() {
        Hamburguer hamburguer = new Hamburguer();
        hamburguer.setAvaliacao("BOM");

        assertEquals(8.0f, hamburguer.getNota());
        assertEquals("BOM", hamburguer.getAvaliacao());
    }

    @Test
    void deveConverterConceitoRegularParaNotaSete() {
        Hamburguer hamburguer = new Hamburguer();
        hamburguer.setAvaliacao("REGULAR");

        assertEquals(7.0f, hamburguer.getNota());
    }

    @Test
    void deveConverterConceitoRuimParaNotaZero() {
        Hamburguer hamburguer = new Hamburguer();
        hamburguer.setAvaliacao("RUIM");

        assertEquals(0.0f, hamburguer.getNota());
        assertEquals("RUIM", hamburguer.getAvaliacao());
    }
}
