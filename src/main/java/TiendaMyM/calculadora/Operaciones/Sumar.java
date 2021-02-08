package TiendaMyM.calculadora.Operaciones;

public class Sumar extends Operacion {

    public Sumar(float a, float b) {
        super(a,b);
    }

    @Override
    public float operar() {
        return this.a + this.b;
    }
}
