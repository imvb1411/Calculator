package TiendaMyM.calculadora.Operaciones;

public class Multiplicar extends Operacion {

    public Multiplicar(float a, float b) {
        super(a, b);
    }

    @Override
    public float operar() {
        return this.a * this.b;
    }
}
