package TiendaMyM.calculadora.Operaciones;

public abstract class Operacion {

    protected float a;
    protected float b;

    public Operacion(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    protected abstract float operar();

}
