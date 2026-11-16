/*
Programa que lee dos números A y B, y cálcula la potencia de A elevado a B sin usar Math.pow.
20261116
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T12_VFaberoAmaya {
    public static void main(String[] args) {

        boolean esPositivo, esCero;
        double numeroA, potencia;
        int numeroB, i;
        Scanner sc = new Scanner(System.in);

        esPositivo = false;
        esCero = false;
        i = 0;

        System.out.println("Va a introducir dos números, se calculará la potencia del primero elevado al segundo.");
        System.out.print("Introduzca el primer número: ");
        numeroA = sc.nextDouble();
        System.out.print("\nIntroduzca ahora el segundo: ");
        numeroB = sc.nextInt();

        potencia = 1;

        if (numeroB > 0) {
            esPositivo = true;
        } else if (numeroB == 0) {
            esCero = true;
        }

        if (esCero) {
            System.out.printf("%f elevado a %d es 1.", numeroA, numeroB);
            System.exit(0);
        }

        if (esPositivo) {
            while (i < numeroB) {
                potencia *= numeroA;
                i++;
            }
        } else {
            while (i > numeroB) {
                potencia *= numeroA;
                i--;
            }
            potencia = 1 / potencia;
        }

        System.out.printf("%.2f elevado a %d es %.4f.", numeroA, numeroB, potencia);
    }
}