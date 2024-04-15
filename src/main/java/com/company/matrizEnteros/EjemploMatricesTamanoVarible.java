package com.company.matrizEnteros;

/**
 *
 * @author Jhonatan
 */
public class EjemploMatricesTamanoVarible {

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        int matriz[][] = new int[3][];
        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        //mostrar el lengt
        System.out.println("Matriz lengt: " + matriz.length);
        System.out.println("Fila 0: " + matriz[0].length);
        System.out.println("Fila 1: " + matriz[1].length);
        System.out.println("Fila 2; " + matriz[2].length);
        
        llenarMatriz(matriz);
        mostarMatriz(matriz);
        

    }

    public static void llenarMatriz(int matriz[][]){
        System.out.println("LLenar las matriz con datos");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //asignamos 
                matriz[i][j] = i*j;
            }
        }
    }
    public static void mostarMatriz(int matriz[][]) {
        System.out.println("Mostrando los datos: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
