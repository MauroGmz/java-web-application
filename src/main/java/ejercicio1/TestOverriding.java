package ejercicio1;

public class TestOverriding {
    public static void main(String[] args) {
        Base obj1 = new Derived();
        // obj1.display(); No se puede acceder dado que el método es privado
        obj1.print();

        // El método privado solo puede ser accedido desde su propia clase y no desde otra
        // Se puede acceder al método privado a través de otro método público que acceda al método privado estático de la misma clase
        obj1.access();
    }
}
