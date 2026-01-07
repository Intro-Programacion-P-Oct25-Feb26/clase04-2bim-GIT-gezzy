/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo045 {

    public static void main(String[] args) {
        // 

        int[][] arreglo1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] arreglo2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] arreglo3 = llenarMatriz(arreglo1, arreglo2);
        int[][] arreglo4 = llenarMatriz2(arreglo1, arreglo2);

        /*for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                arreglo3[i][j] = obtenerMultiplicacion(arreglo1[i][j], 
                        arreglo2[i][j]);
            }
        }*/
        obtenerReporte(arreglo1);
        obtenerReporte(arreglo2);
        obtenerReporte(arreglo3);
        obtenerReporte(arreglo4);
    }

    public static void obtenerReporte(int[][] arreglo1) {
        String cadena = "";
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, arreglo1[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }

    public static int[][] llenarMatriz(int a[][], int b[][]) {
        int resultado[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                resultado[i][j] = obtenerMultiplicacion(a[i][j],
                        b[i][j]);
            }
        }
        return resultado;

    }

    public static int[][] llenarMatriz2(int a[][], int b[][]) {
        int resultado[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                resultado[i][j] = obtenerPotencia(a[i][j],
                        b[i][j]);
            }
        }
        return resultado;

    }

    public static int obtenerMultiplicacion(int a, int b) {
        int operacion;
        operacion = a * b;
        return operacion;

    }

    public static int obtenerPotencia(int a, int b) {
        double operacion;
        operacion = Math.pow(a, b);
        return (int) operacion;

    }

}
