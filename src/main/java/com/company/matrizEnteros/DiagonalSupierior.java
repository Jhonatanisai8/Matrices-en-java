package com.company.matrizEnteros;

/**
 *
 * @author Jhonatan
 */
public class DiagonalSupierior {

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        int matriz[][] = new int[7][7];
        rellenarMatriz(matriz);

    }

    public static void rellenarMatriz(int matriz[][]) {
        System.out.println("Rellenando la Matriz con ceros y unos ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j || ( i + j) == (matriz.length - 1)) {
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
