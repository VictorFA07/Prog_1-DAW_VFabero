/*
Programa que pide diez números reales por teclado, los guarda en un vector y después muestra todos sus valores.
20261126
Hecho por: Víctor Fabero Amaya
*/

package UD6_Arrays;

import java.util.Scanner;

public class UD6_TA01_VFaberoAmaya {
    public static void main(String[] args) {

        final int TAMANO;
        int [] vector;
        Scanner sc = new Scanner(System.in);

        TAMANO = 10;
        vector = new int[TAMANO];

        System.out.printf("Introduce %d valores: ", TAMANO);

        for (int i = 0; i < vector.length; i++) {
            vector[i] = sc.nextInt();
        }

        System.out.printf("%nEl vector es: ");

        for (int valor:vector) {
            System.out.print(" " + valor);
        }
    }
}