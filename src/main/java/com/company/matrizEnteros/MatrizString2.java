package com.company.matrizEnteros;

/**
 *
 * @author Jhonatan
 */
public class MatrizString2 {

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        String[][] nombres = {{"Pepe","Pepa"},{"Josefa","Paco"},{"Lucas","Pancha"}};

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
