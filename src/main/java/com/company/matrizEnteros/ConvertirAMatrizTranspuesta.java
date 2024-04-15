package com.company.matrizEnteros;

/**
 *
 * @author Jhonatan
 */
public class ConvertirAMatrizTranspuesta {

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println("Matriz original");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("Matriz de nuevo: ");
        transpuestra(matriz);

    }

    public static void transpuestra(int matriz[][]) {
        //recoree todas las filas
        int aux = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        System.out.println("--------------------");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + "\t");
            }
            System.out.println("");
        }
    }
}
