package TiendaMyM.calculadora.Operaciones;

public class Dividir extends Operacion {

    public Dividir(float a, float b) {
        super(a, b);
    }

    @Override
    public float operar() {
        return this.a / this.b;
    }
}
