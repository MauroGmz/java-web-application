package ejercicio1;

public class TestOutput {

    public static void main(String[] args) {
        Parent obj1 = new Child();
        Child obj2 = new Child();
        obj1.foo();
        obj2.foo();
        obj1.bar();
        obj2.bar();
        Parent.foo();
        Child.foo();
    }
    /*

        Salida:

        I am foo in Parent: El método foo() de Child se oculta, se ejecuta foo() de la clase de referencia

        I am foo in Child:  obj2 está instanciado con una referencia del mismo tipo, se ejecuta foo() de Child

        I am bar in Child:  El método bar() de Child sobreescribe el método bar() no estático de Parent y se ejecuta el método bar() de Child

        I am bar in Child:  el objeto obj2 de tipo Child con una referencia de tipo Child va a ejecutar el código de la clase Child

        I am foo in Parent: Para llamar un método estático público de una clase basta con colocar el nombre de la clase, el operador punto
                            y el nombre del método estático, es decir que no debemos utilizar el objeto

        I am foo in Child:  Mismo caso que el anterior

     */

}

