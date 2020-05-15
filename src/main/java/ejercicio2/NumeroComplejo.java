package ejercicio2;

public class NumeroComplejo extends Numero {
    private double numReal;
    private double numImag;

    protected NumeroComplejo(String tipoNumero, double numReal, double numImag) {
        super(tipoNumero);
        this.numReal = numReal;
        this.numImag = numImag;
    }

    @Override
    public void sumar(Numero n) {

    }

    @Override
    public void restar(Numero n) {

    }

    @Override
    public void multiplicarPor(Numero n) {

    }

    @Override
    public void dividirPor(Numero n) {

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "parte real= " + numReal + "parte imaginaria= " + numImag +
                '}';
    }
}
