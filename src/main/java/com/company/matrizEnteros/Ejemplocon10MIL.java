package com.company.matrizEnteros;

/**
 *
 * @author Jhonatan
 */
public class Ejemplocon10MIL {

    public static void main(String[] args) {
        int matriz[][] = new int[9000][100];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j * 2;
            }
        }

        System.out.println("Datos de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]\t");
            }
            System.out.println("");
        }

        boolean estado = false;
        int eleBuscar = 89;
        int i;
        int j = 0;
        buscar:
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == eleBuscar) {
                    estado = true;
                    break buscar;
                }
            }
        }

        if (estado) {
            System.out.println("Elemento " + eleBuscar + " Encontrado en la posicion : " + i + " " + j);
        } else {
            System.out.println("Elemento " + eleBuscar + "no encontrado");
        }
    }
}
