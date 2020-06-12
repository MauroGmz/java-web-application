package clase1.ejercicios;

public class Derived extends Base{

    private static void display(){ System.out.println("Static or class method from Derived"); }

    @Override
    public void print(){ System.out.println("Static or class method from Derived"); }

}

