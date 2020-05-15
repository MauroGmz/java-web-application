package ejercicio3;

import java.io.*;
import java.util.*;

public class EjerciciosFlujoIO {

    public static void main(String[] args) throws IOException {

        // Ejercicio 3.1 - Redireccionar el flujo de datos de una entrada a una salida por pantalla

        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();
        System.out.println("texto = " + text);


        // Ejercicio 3.2 y 3.4 - Redireccionar el flujo de datos de una entrada a una salida del tipo error

        try {

            System.out.println("Escriba un número entre el rango del 1 al 10:");
            int number = reader.nextInt();
            if (number <= 10)
                System.out.println("numero = " + number);
            else
                System.err.println("El número es mayor que 10");

        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
        finally {
            System.out.println("El programa finalizó");
        }


        // Ejercicio 3.3 y 3.4 - Desarrollar un lector de caracteres tipeados, y guardarlos en un archivo

        try {
            FileWriter fw = new FileWriter("C:\\Disco de archivos\\fichero1.txt");


            String text3 = reader.next();
            while (!text3.equals("fin")) {
                text3 = reader.next();
                fw.write(text3);
            }
            fw.flush();
            fw.close();
            System.out.println("El fichero se escribió correctamente");
        }
        catch (IOException e){
            System.out.println("Error E/S: "+e);
            System.out.println("No se ha podido escribir el fichero");
        }
        finally {
            System.out.println("El programa finalizó");
        }


        // Ejercicio 3.5 - Crear el punto 1 con un thread, pasando el in y out

        Thread hilo1 = new MyThread2("Thread 1", reader);
        hilo1.start();

    }

}
