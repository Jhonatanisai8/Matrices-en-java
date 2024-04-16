package com.company.matrizEnteros;

/**
 *
 * @author Jhonatan
 */
public class MatrizMarco {

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        int matriz[][] = new int[5][5];
        matrizMarco(matriz);
    }

    public static void matrizMarco(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || i == matriz.length - 1) {
                    matriz[i][j] = 1;
                }
                if (j == 0 || j == matriz[i].length - 1) {
                    matriz[i][j] = 1;
                }
                if (i == j) {
                    matriz[i][j] = 1;
                }
            }
        }

        mostrarMatriz(matriz);
    }

    public static void mostrarMatriz(int matriz[][]) {
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("[" + matriz1[j] + "]\t");
            }
            System.out.println("");
        }
    }

}
