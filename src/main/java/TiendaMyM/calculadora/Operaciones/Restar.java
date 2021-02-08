package TiendaMyM.calculadora.Operaciones;

public class Restar extends Operacion {
    public Restar(float a, float b) {
        super(a, b);
    }

    @Override
    public float operar() {
        return this.a - this.b;
    }
}
