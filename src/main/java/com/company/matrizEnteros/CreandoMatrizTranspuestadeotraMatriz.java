package com.company.matrizEnteros;

/**
 *
 * @author Jhonatan
 */
public class CreandoMatrizTranspuestadeotraMatriz {

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        int matriz1[][] = new int[8][4];
        int matriz2[][] = new int[4][8];
        System.out.println("Numero de filas Matriz 1: " + matriz1.length);
        System.out.println("Numero de columnas Matriz 1: " + matriz1[0].length);
        System.out.println("--------------------------");
        System.out.println("Numero de filas Matriz 2: " + matriz2.length);
        System.out.println("Numero de columnas Matriz 2: " + matriz2[0].length);
        System.out.println("--------------------------");
        System.out.println("Datos de la matriz: ");

        //rellenamos la matrix con datos
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = i + j * 3;
            }
        }

        //mostramos
        for (int[] matriz11 : matriz1) {
            for (int j = 0; j < matriz11.length; j++) {
                System.out.print(matriz11[j] + "\t");
            }
            System.out.println("");
        }

        //llamamos al metodo 
        trasnponerMatriz(matriz1, matriz2);
    }

    public static void trasnponerMatriz(int matriz1[][], int matriz2[][]) {
        int aux = 0;
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                aux = matriz1[j][i];
               
                matriz2[i][j] = matriz1[j][i];
            }
        }

        System.out.println("Datos de la segunda matriz: ");
        for (int[] matriz21 : matriz2) {
            for (int j = 0; j < matriz21.length; j++) {
                System.out.print("[" + matriz21[j] + "]\t");
            }
            System.out.println("");
        }
    }

}
