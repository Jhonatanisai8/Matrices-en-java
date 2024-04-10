package com.mycompany;

/**
 *
 * @author Jhonatan
 */
public class Clase13Matrices {

    public static void main(String[] args) {

        System.out.println("Hello World! Hoy veremos Matrices en Java");
       // ejemplo();
       ejemploMatriz();
    }

    public static void ejemplo() {
        //defimo mi matriz
        int numeros[][] = new int[2][4];

        //tamaño de la matriz
        System.out.println("");
        System.out.println("Número de filas: " + numeros.length);
        System.out.println("Número de Columnas: " + numeros[0].length);

        System.out.println("");

        //inicializacion de los elementos
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        //obtener los elementos
        int n1 = numeros[0][0];
        int n2 = numeros[0][1];
        int n3 = numeros[0][2];
        int n4 = numeros[0][3];

        //recoriiendo la matriz con el bucle for
        System.out.println("");
        System.out.println("Elementos de la Matriz");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("");
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("[" + numeros[i][j] + "]");
            }
        }
    }

    public static void ejemploMatriz() {
        //declaracion, instanciacion e inicializacion de una matriz
        //se utiliza cuando conocemos los elementos y el tamaño de la Matriz
        int numeros[][] = {{1, 2, 3, 4}, {11, 12, 13, 14}};
        //mostramos la matriz
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("");
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("[" + numeros[i][j] + "]");
            }
        }
    }

}
