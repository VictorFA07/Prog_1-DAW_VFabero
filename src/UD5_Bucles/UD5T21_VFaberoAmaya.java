/*
Programa que pide dos números enteros A y B, con B mayor que A, muestre los números desde A hasta B e indique cuántos de ellos son pares.
20261118
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T21_VFaberoAmaya {
    public static void main(String[] args) {

        int numeroA, numeroB, i, contadorPar;
        Scanner sc = new Scanner(System.in);

        contadorPar = 0;

        System.out.println("Va a introducir dos números enteros, el segundo mayor que el primero, el programa mostrará los números que hay entre los dos y cuantos son pares.");
        System.out.print("Introduzca el primer número: \n");
        numeroA = sc.nextInt();
        System.out.print("Introduzca el segundo número: \n");
        numeroB = sc.nextInt();

        if (numeroA > numeroB) {
            System.out.println("El segundo número debe de ser mayor que el primero.");
            System.exit(0);
        }

        i = numeroA;

        while (i <= numeroB) {
            System.out.print(i + " ");
            if ((i % 2) == 0) {
                contadorPar++;
            }
            i++;
        }

        System.out.printf("%nHay %d números pares.", contadorPar);
    }
}