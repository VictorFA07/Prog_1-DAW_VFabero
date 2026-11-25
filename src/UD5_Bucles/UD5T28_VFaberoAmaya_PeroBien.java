/*
Programa que muestra las tablas de multiplicar del 1 al 10 en una cuadrícula, con una fila por tabla, una columna por multiplicador y una cabecera de forma alineada.
20261123
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

public class UD5T28_VFaberoAmaya_PeroBien {
    public static void main(String[] args) {

        final int TABLA_DE;
        int i, j, k, producto, ladoTabla;

        TABLA_DE = 10;
        ladoTabla = TABLA_DE + 1;
        i = 1;
        j = 1;

        System.out.printf("Aquí están las tablas de multiplicar de los primeros %d números naturales.%n", TABLA_DE);

        System.out.printf("X");

        while (i < ladoTabla) {
            System.out.printf("%4d", i);
            i++;
        }

        System.out.println();

        while (j < ladoTabla) {
            System.out.printf("%-1d", j);
            k = 1;
            while (k <= TABLA_DE) {
                producto = j * k;
                System.out.printf("%4d", producto);
                k++;
                if (k == ladoTabla) {
                    System.out.println();
                }
            }
            j++;
        }
    }
}