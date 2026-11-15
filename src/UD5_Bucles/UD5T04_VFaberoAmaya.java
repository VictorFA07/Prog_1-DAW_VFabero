/*
Programa que muestra los números desde el 1 hasta el número que se introduce por teclado.
20261112
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T04_VFaberoAmaya {
    public static void main(String[] args) {

        int numero, i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número y el programa mostrará todos los números enteros que hay desde el 1 hasta el que has introducido: ");
        numero = sc.nextInt();

        if (numero >= 1) {
            for (i = 1; i <= numero; i++) {
                System.out.println(i);
            }
        } else {
            for (i = 1; i >= numero; i--) {
                System.out.println(i);
            }
        }
    }
}