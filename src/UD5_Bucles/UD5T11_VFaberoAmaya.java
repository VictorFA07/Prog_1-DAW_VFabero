/*
Programa que suma por separado los números pares e impares que hay entre 100 y 200, ambos incluidos.
20261116
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

public class UD5T11_VFaberoAmaya {
    public static void main(String[] args) {

        int numero, i, sumaPar, sumaImpar;

        sumaPar = 0;
        sumaImpar = 0;
        i = 100;

        System.out.println("El programa va sumar por separado los números pares y los impares que hay entre 100 y 200.");

        while (i <= 200) {
            numero = i;
            i++;
            if ((numero % 2) == 0) {
                sumaPar = numero + sumaPar;
            } else {
                sumaImpar = numero + sumaImpar;
            }
        }

        System.out.printf("La suma de los números pares entre 100 y 200 es: %d, y la de los números impares es: %d.", sumaPar, sumaImpar);
    }
}