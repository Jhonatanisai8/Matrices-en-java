package com.company.matrizEnteros;

/**
 *
 * @author User
 */
public class MatrizEnteros {

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        int[][] numeros = new int[2][4];
        System.out.println("Numero de filas: " + numeros.length);
        System.out.println("Numero de columnas: " + numeros[0].length);

        //lenamos la matriz 
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;
        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        //para saber el primer y ultimo registros
        System.out.println("Primer elemento de la matriz: " + numeros[0][0]);
        System.out.println("Ultimo numero de la matriz: " + numeros[numeros.length - 1][numeros[1].length - 1]);

        mostrarDatos(numeros);
    }

    public static void mostrarDatos(int matriz[][]) {
        System.out.println("");
        int num1 = matriz[0][0];
        int num2 = matriz[0][1];
        int num3 = matriz[0][2];
        int num4 = matriz[0][3];

        int num5 = matriz[1][0];
        int num6 = matriz[1][1];
        int num7 = matriz[1][2];
        int num8 = matriz[1][3];

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);

    }
}
