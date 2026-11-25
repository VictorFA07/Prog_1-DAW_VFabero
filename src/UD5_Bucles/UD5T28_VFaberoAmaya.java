/*
Programa que muestra las tablas de multiplicar del 1 al 10 en una cuadrícula, con una fila por tabla, una columna por multiplicador y una cabecera de forma alineada.
20261123
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UD5T28_VFaberoAmaya {
    public static void main(String[] args) {

        final int TABLA_DE;
        int i, j, k, contadorEspacios, contadorEspacios2, producto, ladoTabla;
        char espacio;

        TABLA_DE = 10;
        ladoTabla = TABLA_DE + 1;
        i = 1;
        j = 1;
        espacio = ' ';
        contadorEspacios = 0;
        contadorEspacios2 = 0;

        System.out.printf("Aquí están las tablas de multiplicar de los primeros %d números naturales.%n", TABLA_DE);

        System.out.print("X");

        while (i < ladoTabla) {
            contadorEspacios++;
            while ((contadorEspacios % 5) != 0) {
                System.out.print(espacio);
                contadorEspacios++;
            }
            System.out.print(i);
            i++;
        }

        System.out.println();

        while (j < ladoTabla) {
            System.out.print(j);
            k = 1;
            while (k <= TABLA_DE) {
                contadorEspacios2++;
                while ((contadorEspacios2 % 5) != 0) {
                    System.out.print(espacio);
                    contadorEspacios2++;
                }
                producto = j * k;
                System.out.print(producto);
                k++;
                if (k == ladoTabla) {
                    System.out.println();
                }
            }
            j++;
        }
    }
}