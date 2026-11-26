/*
Programa que pide diez números reales por teclado, los guarda en un vector y muestra la suma de todos ellos.
20261126
Hecho por Víctor Fabero Amaya
 */

package UD6_Arrays;

import java.util.Scanner;

public class UD6_TA02_VFaberoAmaya {
    public static void main(String[] args) {

        final int TAMANO;
        double [] vector;
        double suma;
        Scanner sc = new Scanner(System.in);

        TAMANO = 10;
        suma = 0;
        vector = new double[TAMANO];

        System.out.printf("Introduce %d valores: ", TAMANO);

        for (int i = 0; i < vector.length; i++) {
            vector[i] = sc.nextDouble();
            suma += vector[i];
        }

        System.out.printf("%nEl vector es: ");

        for (double valor:vector) {
            System.out.print(" " + valor);
        }

        System.out.printf("%nY su suma vale %.2f.", suma);
    }
}