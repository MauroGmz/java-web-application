package clase2.ejemplos;

import java.io.*;

public class FilesFicheroTextoApp {

    public static void main(String[] args) {

        try{
            //Creo los objetos, abro streams
            FileWriter fw=new FileWriter("C:\\Disco de archivos\\fichero1.txt");
            FileReader fr=new FileReader("C:\\Disco de archivos\\fichero1.txt");
            //Escribimos en el fichero un String y un caracter 97 (a)
            fw.write("Esto es una prueba");
            fw.write(97);
            //Guardamos los cambios del fichero
            fw.flush();
            //Leemos el fichero y lo mostramos por pantalla
            int valor=fr.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fr.read();
            }
            //Cerramos el stream
            fw.close();
            fr.close();
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }

    }

}
