package ejercicio2;

public class NumeroReal extends Numero {
    private double numero;

    protected NumeroReal(String tipoNumero, double numero) {
        super(tipoNumero);
        this.numero = numero;
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
                "numero= " + numero +
                '}';
    }
}
