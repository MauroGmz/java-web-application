package ejercicio3;

import java.util.Scanner;

public class MyThread2 extends Thread{
    Scanner reader;

    public MyThread2(String name, Scanner reader){
        super(name);
        this.reader = reader;
    }

    public void run(){
        String text = reader.nextLine();
        System.out.println("Hilo ejecutado: " + this.getName());
        System.out.println("texto = " + text);
    }

}
