package com.company.matrizEnteros;

/**
 *
 * @author Jhonatan
 */
public class MatrizString {

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        String[][] nombres = new String[3][2];
        nombres[0][0] = "Pepe";
        nombres[0][1] = "Pepa";
        nombres[1][0] = "Lucas";
        nombres[1][1] = "Pedro";
        nombres[2][0] = "Mateo";
        nombres[2][1] = "Juan";

        //forma con el bucle for normal 
        //mostrarConfor(nombres);
        
        mostrarConForEach(nombres);
    }

    public static void mostrarConfor(String matriz[][]) {

        System.out.println("Mostrando datos de la matriz Con for Normal:\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static void mostrarConForEach(String nombres[][]) {
        System.out.println("Mostrando datos de la matriz Con for EACH:\n");

        for (String[] fila : nombres) {
            for (String nombre : fila) {
                System.out.print(nombre+ "\t");
            }
            System.out.println("");
        }
    }
}
