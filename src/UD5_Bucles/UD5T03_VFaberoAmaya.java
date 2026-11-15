/*
Programa que muestra los números pares comprendidos entre el 1 y el 200, pero con un contador de 1 en 1, comprobando cada número.
20261112
Hecho por Víctor Fabero Amaya
 */

package UD5_Bucles;

public class UD5T03_VFaberoAmaya {
    public static void main(String[] args) {

        int i;

        System.out.println("Los números pares que hay entre el 1 y el 200 son: ");

        for (i = 1; i <= 200; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
    }
}