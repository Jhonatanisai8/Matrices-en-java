package com.company.matrizEnteros;

/**
 *
 * @author Jhonatan
 */
public class EjemploMatrizSimetrica {

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        int[][] matriz = {
            {0, 6, 3, 4},
            {2, 1, 0, 5},
            {3, 0, 1, 6},
            {4, 5, 6, 7}
        };

        boolean essimetrica = esSimetricaConForEtiqueta(matriz);
        if (essimetrica) {
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz no es simetrica");
        }
    }

    public static boolean esSimetrica(int matriz[][]) {
        boolean essim = true;
        int i, j;
        i = 0;
        while (i < matriz.length && essim == true) {
            j = 0;
            while (j < i && essim == true) {
                if (matriz[i][j] != matriz[j][i]) {
                    essim = false;
                }
                j++;
            }
            i++;
        }
        return essim;
    }

    public static boolean esSimetricConEtiqueta(int matriz[][]) {
        boolean esSimetric = true;
        boolean essim = true;
        int i, j;
        i = 0;
        salir:
        while (i < matriz.length) {
            j = 0;
            while (j < i) {
                if (matriz[i][j] != matriz[j][i]) {
                    essim = false;
                    break salir;
                }
                j++;
            }
            i++;
        }
        return essim;
    }

    public static boolean esSimetricaConFor(int matriz[][]) {
        boolean esSimetrica = true;
        for (int i = 0; i < matriz.length && esSimetrica == true; i++) {
            for (int j = 0; j < i && esSimetrica == true; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                }
            }
        }
        return esSimetrica;
    }

    public static boolean esSimetricaConForEtiqueta(int matriz[][]) {
        boolean esSimetrica = true;
        salir:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                    break salir;
                }
            }
        }
        return esSimetrica;
    }

}
