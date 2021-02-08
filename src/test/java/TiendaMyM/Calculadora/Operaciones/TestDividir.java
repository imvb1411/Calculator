package TiendaMyM.Calculadora.Operaciones;

import TiendaMyM.calculadora.Operaciones.Dividir;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDividir {
    private Dividir dividir;
    @Before
    public void setUp() throws Exception {
        dividir = new Dividir(0,0);
    }

    @Test
    public void multiplicar_2_2_4() {
        dividir.setA(2);
        dividir.setB(2);
        assertEquals(1,dividir.operar(),0);
    }
}
