/*
Programa que pide diez números reales por teclado, los guarda en un vector y lo recorre para encontrar el máximo y el mínimo, que mostrará por pantalla.
20261126
Hecho por Víctor Fabero Amaya
 */

package UD6_Arrays;

import java.util.Scanner;

public class UD6_TA03_VFaberoAmaya {
    public static void main(String[] args) {

        final int TAMANO;
        double [] vector;
        double min, max;
        int i;
        Scanner sc = new Scanner(System.in);

        TAMANO = 10;
        vector = new double[TAMANO];
        i = 0;

        System.out.printf("Introduce %d valores: ", TAMANO);

        vector[i] = sc.nextDouble();
        min = vector[i];
        max = min;

        while (i < vector.length) {
            vector[i] = sc.nextDouble();
            max = Math.max(max, vector[i]);
            min = Math.min(min, vector[i]);
            i++;
        }

        System.out.printf("%nEl valor mínimo es %.4f y el máximo es %.4f.", min, max);
    }
}