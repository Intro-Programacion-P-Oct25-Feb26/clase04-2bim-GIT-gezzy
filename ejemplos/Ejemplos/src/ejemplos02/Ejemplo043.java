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
public class Ejemplo043 {

    public static void main(String[] args) {

        int[] valores1 = {10, 100, 1000, 20, 200, 2000};
        int[] valores2 = {1000, 1001, 1002, 1003, 1004, 1005};
        for (int i = 0; i < valores1.length; i++) {
            int v1 = valores1[i];
            int v2 = valores2[i];
            obtenerSuma(v1, v2);
        }
        /* El programa funciona con la creacion de dos metodos, el metodo
        principal y el metodo obtenerSuma. Dentro del metodo principal existen
        dos cadenas del mismo tamaño cuyos valores son sumados de uun arreglo 
        en cada pasicion para su correspondiente en otro, usando un ciclo for
        e invocando al metodo (funcion) obtenerSuma en el cual ocurre la 
        verdadera operacion y se presentan los valores sumados.
         */
    }

    public static void obtenerSuma(int a, int b) {
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);
    }
}
