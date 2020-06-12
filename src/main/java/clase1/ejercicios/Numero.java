package clase1.ejercicios;

public abstract class Numero {
    protected String tipoNumero;

    protected Numero(String tipoNumero){
        this.tipoNumero = tipoNumero;
    }

    public abstract void sumar(Numero n);

    public abstract void restar(Numero n);

    public abstract void multiplicarPor(Numero n);

    public abstract void dividirPor(Numero n);

    @Override
    public String toString() {
        return "Numero{" +
                "tipoNumero= '" + tipoNumero + '\'' +
                '}';
    }
}
