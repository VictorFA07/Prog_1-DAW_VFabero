/*
Programa que lee números y acepta únicamente los que sean mayores que el último introducido, termina con un 0. Al final se muestra el total de números introducidos, sin contar el 0, y el total de fallos.
20261118
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T17_VFaberoAmaya {
    public static void main(String[] args) {

        double numeroActual, numeroAnterior;
        int i, contadorErrores;
        Scanner sc = new Scanner(System.in);

        contadorErrores = 0;
        i = 0;

        System.out.println("Va a introducir números, cada uno que introduzca debe de ser mayor que el anterior, sino, se producirá un error, pero el programa seguirá ejecutándose hasta que introduzca un 0.");
        System.out.print("Introduzca un primer número: ");
        numeroActual = sc.nextDouble();

        while (numeroActual != 0) {

            numeroAnterior = numeroActual;

            System.out.print("Introduzca el siguiente número: ");
            numeroActual = sc.nextDouble();

            if ((numeroActual < numeroAnterior) && (numeroActual != 0)) {
                contadorErrores++;
                System.out.println("Número inválido.");
            }

            i++;
        }

        System.out.printf("Se han introducido %d números y han habido %d errores.", i, contadorErrores);
    }
}