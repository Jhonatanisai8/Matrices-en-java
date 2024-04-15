package com.company.matrizEnteros;

/**
 *
 * @author Jhonatan
 */
public class EjemploMatricesBuscar {

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        int matriz[][] = {
            {35, 67, 78, 244},
            {12, 234, 123, 76},
            {11, 66, 55, 88}
        };

        System.out.println("Nº de filas: " + matriz.length);
        System.out.println("Nº de columnas: " + matriz[0].length);
        int buscar = 55;
        boolean encontrado = false;
        buscar(matriz, buscar, encontrado);

    }

    public static void buscar(int matriz[][], int eleBuscar, boolean estado) {
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
