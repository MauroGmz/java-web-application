package ejercicio2;

public class NumeroEntero extends Numero {
    private long numero;

    protected NumeroEntero(String tipoNumero, long numero) {
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

