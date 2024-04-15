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
            {12, 234, 55, 76},
            {11, 66, 55, 88}
        };

        int buscar = 9999;
        boolean encontrado = false;
        buscar(matriz, buscar, encontrado);
        
    }

    public static void buscar(int matriz[][], int eleBuscar, boolean estado) {
        buscar:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == eleBuscar) {
                    estado = true;
                    break buscar;
                }
            }
        }

        if (estado) {
            System.out.println("Encontrado");
        } else {
            System.out.println("NO encontrado");
        }
    }
}
