package clase2.ejemplos;

import java.util.*;

public class FilesFicheroTextoApp2 {

    public static void main(String[] args) {

        try {
            //Declaro Scanner para la lectura de datos
            Scanner reader = new Scanner(System.in);
            String texto = reader.next();
            while (!texto.equals("FIN")) {
                texto = reader.next();
                System.out.print(texto);
            }
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }

    }

}
