/*
Programa que calcula la suma de los cuadrados de los 5 primeros números naturales.
20261118
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

public class UD5T18_VFaberoAmaya {
    public static void main(String[] args) {

        final int MAXIMO;
        int i, sumaPotencia;

        MAXIMO = 5;
        i = 1;
        sumaPotencia = 0;

        System.out.printf("El programa calcula la suma del cuadrado de los primeros %d números naturales.%n", MAXIMO);

        while (i <= MAXIMO) {
            sumaPotencia = sumaPotencia + i * i;
            i++;
        }

        System.out.printf("La suma del cuadrado de los primeros 5 números naturales es igual a %d.", sumaPotencia);
    }
}