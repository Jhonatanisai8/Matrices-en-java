package com.company.matrizEnteros;

/**
 *
 * @author Jhonatan
 */
public class SumarFilasColumnas {

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i + j * 4;
                b[i][j] = i + j * 12;
            }
        }

        mostrar(a);
        sumaTotal(a);
        sumaFilas(a);
    }

    public static void mostrar(int a[][]) {

        System.out.println("Datos de la matriz A");
        for (int[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                System.out.print(a1[j] + "\t");
            }
            System.out.println("");
        }
    }

    public static void sumaTotal(int a[][]) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                suma += a[i][j];
            }
        }
        System.out.println("Suma Total: " + suma);
        System.out.println("");
    }

    public static void sumaFilas(int a[][]) {
        int sumaFila;
        int sumaColunma;
        int i, j;
        for (i = 0; i < a.length; i++) {
            sumaColunma = 0;
            sumaFila = 0;
            for (j = 0; j < a[i].length; j++) {
                sumaFila = sumaFila + a[i][j];
                sumaColunma += a[j][i];
            }
            System.out.println("Suma de la fila " + i + " :" + sumaFila);
            System.out.println("Suma de la columna " + i + " :" + sumaColunma);
        }
    }

}
