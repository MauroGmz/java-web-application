package clase1.ejercicios;

public class CalculadoraDeMatrices2 {

    public static boolean verificarMatriz(Numero matriz1[][], Numero matriz2[][]){

        if(matriz1.length == matriz2.length)
            return true;
        else
            return false;

    }

    public void sumarMatriz(Numero matriz1[][],Numero matriz2[][]){

        if(verificarMatriz(matriz1, matriz2))
            System.out.println("Suma de matriz");
        else
            System.out.println("Matrices inválidas");

    }

    public void restarMatriz(Numero matriz1[][],Numero matriz2[][]){

        if(verificarMatriz(matriz1, matriz2))
            System.out.println("Suma de matriz");
        else
            System.out.println("Matrices inválidas");

    }

    public void trazaMatriz(Numero matriz[][]){ System.out.println("Traza de matriz"); }

    public void determinanteMatriz(Numero matriz[][]){ System.out.println("Determinante de matriz"); }

}
