package TiendaMyM.Calculadora.Operaciones;

import TiendaMyM.calculadora.Operaciones.Sumar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSumar {

    private Sumar sumar;
    @Before
    public void setUp() throws Exception {
        sumar = new Sumar(0,0);
    }

    @Test
    public void sumar_2_2_4() {
        sumar.setA(2);
        sumar.setB(2);
        assertEquals(4,sumar.operar(),0);
    }
}
