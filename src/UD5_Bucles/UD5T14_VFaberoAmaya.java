/*
Programa que, dada una cantidad de euros introducida por teclado y múltiplo de 5, muestra los billetes de cada tipo necesarios para alcanzarla usando el mínimo número de billetes.
20261116
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T14_VFaberoAmaya {
    public static void main(String[] args) {

        int dinero, numeroBilletes, valorBilletes;
        Scanner sc = new Scanner(System.in);

        valorBilletes = 500;

        System.out.print("Introduce una cantidad de dinero y se le mostrará cuál es el menor número de billetes \nposibles para cubrir esa cantidad (tenga en cuenta que debe de ser múltiplo de 5): ");
        dinero = sc.nextInt();

        if (((dinero % 5) != 0) || dinero <= 0) {
            System.out.println("Cantidad inválida.");
            System.exit(0);
        }

        while (dinero > 0) {

            numeroBilletes = dinero / valorBilletes;
            dinero = dinero % valorBilletes;

            if (numeroBilletes > 1) {
                System.out.printf("Necesitas %d billetes de %d€.%n", numeroBilletes, valorBilletes);
            } else if (numeroBilletes == 1) {
                System.out.printf("Necesitas 1 billete de %d€.%n", valorBilletes);
            }

            valorBilletes = switch (valorBilletes) {
                case 500 -> 200;
                case 200 -> 100;
                case 100 -> 50;
                case 50 -> 20;
                case 20 -> 10;
                case 10 -> 5;
                default -> 0;
            };
        }
    }
}