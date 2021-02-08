package TiendaMyM.Calculadora.Operaciones;

import TiendaMyM.calculadora.Operaciones.Multiplicar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMultiplicar {

    private Multiplicar multiplicar;
    @Before
    public void setUp() throws Exception {
        multiplicar = new Multiplicar(0,0);
    }

    @Test
    public void multiplicar_2_2_4() {
        multiplicar.setA(2);
        multiplicar.setB(2);
        assertEquals(4,multiplicar.operar(),0);
    }
}
