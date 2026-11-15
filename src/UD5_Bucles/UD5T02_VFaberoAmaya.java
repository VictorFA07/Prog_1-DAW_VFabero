/*
Programa que muestra los números pares comprendidos entre el 1 y el 200.
20261112
Hecho por Víctor Fabero Amaya
 */

package UD5_Bucles;

public class UD5T02_VFaberoAmaya {
    public static void main(String[] args) {

        int i;

        System.out.println("Los números pares que hay entre el 1 y el 200 son: ");

        for (i = 2; i <= 200; i += 2) {
            System.out.println(i);
        }
    }
}