package ejercicio1;

public abstract class Base {

    private static void display(){
        System.out.println("Static or class method fom Base");
    }

    public void print(){ System.out.println("Static or class method from Base"); }

    public void access(){ display(); }

}
