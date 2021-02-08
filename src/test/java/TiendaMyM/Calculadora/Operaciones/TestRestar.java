package TiendaMyM.Calculadora.Operaciones;

import TiendaMyM.calculadora.Operaciones.Restar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRestar {

    private Restar restar;
    @Before
    public void setUp() throws Exception {
        restar = new Restar(0,0);
    }

    @Test
    public void restar_2_2_0() {
        restar.setA(2);
        restar.setB(2);
        assertEquals(0,restar.operar(),0);
    }
}
