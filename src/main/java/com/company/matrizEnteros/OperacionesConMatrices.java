package com.company.matrizEnteros;

import java.util.Scanner;

/**
 *
 * @author Jhonatan
 */
public class OperacionesConMatrices {

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        int a[][] = new int[5][5];
        int b[][] = new int[5][5];
        System.out.println("Los datos de las matrices son: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = i * i + j * 2;
                a[i][j] = i * i + j * 8;
            }
        }

        System.out.println("Los datos de las matriZ A son: ");
        for (int[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                System.out.print("[" + a1[j] + "]\t");
            }
            System.out.println("");
        }

        System.out.println("Los datos de las matriz B son: ");
        for (int[] b1 : b) {
            for (int j = 0; j < b1.length; j++) {
                System.out.print("[" + b1[j] + "]\t");
            }
            System.out.println("");
        }
        Scanner leer = new Scanner(System.in);
        //LLLAMOS AL METODO 
        int opcion;
        do {
            System.out.println("""
                               Operaciones con matrices:
                               1. Sumar Matrices
                               2. Restar Matrices
                               3. Multiplicar Matrices
                               4. Dividir Matrices
                               5. Salir
                               ¿Ingresa una opcion?""");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    sumarMatrices(a, b);
                    break;
                case 2:
                    restarMatrices(a, b);
                    break;
                case 3:
                    multiplicarMatrices(a, b);
                    break;
                case 4:
                    dividirMatrices(a, b);
                    break;
                default:
                    System.out.println("Opcion incorrecta intente de nuevo");
                    break;
            }
        } while (opcion != 5);

    }

    public static void sumarMatrices(int matrizA[][], int[][] matrizB) {
        int sumaMatriz[][] = new int[5][5];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                sumaMatriz[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("La suma de las Matrices es: ");
        for (int[] sumaMatriz1 : sumaMatriz) {
            for (int j = 0; j < sumaMatriz1.length; j++) {
                System.out.print("[" + sumaMatriz1[j] + "]\t");
            }
            System.out.println("");
        }
    }

    public static void restarMatrices(int matrizA[][], int[][] matrizB) {
        int restaMatriz[][] = new int[5][5];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                restaMatriz[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }

        System.out.println("Resta de las Matrices es: ");
        for (int[] restaMatriz1 : restaMatriz) {
            for (int j = 0; j < restaMatriz1.length; j++) {
                System.out.print("[" + restaMatriz1[j] + "]\t");
            }
            System.out.println("");
        }
    }

    public static void multiplicarMatrices(int matrizA[][], int[][] matrizB) {
        int multiplicarMatriz[][] = new int[5][5];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                multiplicarMatriz[i][j] = matrizA[i][j] * matrizB[i][j];
            }
        }

        System.out.println("Multiplicacion de Matrices");
        for (int[] multiplicarMatriz1 : multiplicarMatriz) {
            for (int j = 0; j < multiplicarMatriz1.length; j++) {
                System.out.print("[" + multiplicarMatriz1[j] + "]\t");
            }
            System.out.println("");
        }
    }

    public static void dividirMatrices(int matrizA[][], int[][] matrizB) {
        float dividirMatriz[][] = new float[5][5];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {

                if (matrizA[i][j] != 0 || matrizB[i][j] != 0) {
                    dividirMatriz[i][j] = matrizA[i][j] / matrizB[i][j];
                }
            }
        }

        System.out.println("Divicion de Matrices");
        for (float[] dividirMatriz1 : dividirMatriz) {
            for (int j = 0; j < dividirMatriz1.length; j++) {
                System.out.print("[" + dividirMatriz1[j] + "]\t");
            }
            System.out.println("");
        }
    }

}
