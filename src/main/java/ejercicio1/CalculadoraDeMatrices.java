package ejercicio1;

public class CalculadoraDeMatrices {

    public static boolean verificarMatriz(int matriz1[][],int matriz2[][]){

        if(matriz1.length == matriz2.length)
            return true;
        else
            return false;

    }

    public void sumarMatriz(int matriz1[][],int matriz2[][]){

        if(verificarMatriz(matriz1, matriz2))
            System.out.println("Suma de matriz");
        else
            System.out.println("Matrices inválidas");

    }

    public void restarMatriz(int matriz1[][],int matriz2[][]){

        if(verificarMatriz(matriz1, matriz2))
            System.out.println("Suma de matriz");
        else
            System.out.println("Matrices inválidas");

    }

    public void trazaMatriz(int matriz[][]){

        int traza = 0;
        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[i].length; j++){
                if(j == i)
                    traza += matriz[i][j];
            }
        }
        System.out.println("traza = " + traza);

    }

    public void determinanteMatriz(int matriz[][]){ System.out.println("Determinante de matriz"); }

}

