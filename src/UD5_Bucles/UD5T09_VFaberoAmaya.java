/*
Programa que calcula y muestra la suma y el producto de los 10 primeros números naturales.
20261113
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

public class UD5T09_VFaberoAmaya {
    public static void main(String[] args) {

        String enunciado;
        int i, suma, producto;

        i = 1;
        suma = 0;
        producto = 1;
        enunciado = "El valor de la suma es %d, y el del producto es %d.";

        System.out.println("El programa le va a mostrar cuál es la suma y el producto de los primeros 10 números naturales:");

        while (i <= 10) {
            suma = suma + i;
            producto = producto * i;
            i++;
        }

        System.out.printf(enunciado, suma, producto);
    }
}