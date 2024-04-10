package com.companyMatricesObjetos;

/**
 *
 * @author Jhonatan
 */
public class Ejecutable {

    public static void main(String[] args) {
        //ejemploNombres();
        // ejemplo2Productos();
        ejemploProductos();
    }

    public static void ejemploProductos() {
        Producto[][] productos = new Producto[2][2];
        productos[0][0] = new Producto("Mesa Comedor");
        productos[0][1] = new Producto("TV Sony Led 55");
        productos[1][0] = new Producto("Bicicleta Oxford");
        productos[1][1] = new Producto("Bicicleta Estática Gimnaiso");

        //obtenemos los elementos
        Producto mesa = productos[0][0];
        Producto tvSony = productos[0][1];
        Producto bici = productos[1][0];

        //mostramos los datos
        for (int i = 0; i < productos.length; i++) {
            System.out.println("");
            for (int j = 0; j < productos[i].length; j++) {
                System.out.print("[" + productos[i][j].getNombre() + "]");
            }
        }

    }

    //cuando ya sabemos los datos y tamaño de la matriz
    public static void ejemplo2Productos() {
        Producto[][] productos = {
            {new Producto("Mesa comedor"), new Producto("TV Sony LED 55")},
            {new Producto("Bicicleta Oxford"), new Producto("Bicicleta Estatica Gimnasio")}
        };

        //mostramos los datos
        for (int i = 0; i < productos.length; i++) {
            System.out.println("");
            for (int j = 0; j < productos[i].length; j++) {
                System.out.print("[" + productos[i][j].getNombre() + "]");
            }
        }
    }

    public static void ejemploNombres() {
        String[][] nombres = new String[3][2];
        nombres[0][0] = "Pepe";
        nombres[0][1] = "Mariá";

        nombres[1][0] = "Pato";
        nombres[1][1] = "Bea";

        nombres[2][0] = "Lucas";
        nombres[2][1] = "Luci";

        //obtenemos los nombres
        String nombre1 = nombres[0][0];
        String nombre2 = nombres[0][1];
        String nombre3 = nombres[1][0];
        String nombre4 = nombres[1][1];
        String nombre5 = nombres[2][0];
        String nombre6 = nombres[2][1];

        //mostramos los datos
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("");
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print("[" + nombres[i][j] + "]");
            }
        }

    }
}
