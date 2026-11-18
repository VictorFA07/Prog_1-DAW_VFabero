/*
Programa que pide un número entero positivo y dice si es primo o no.
20261118
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T16_VFaberoAmaya {
    public static void main(String[] args) {

        boolean noEsPrimo;
        int numero, i;
        Scanner sc = new Scanner(System.in);

        i = 2;
        noEsPrimo = false;

        System.out.print("Introduzca un número entero positivo y el programa le dirá si es primo: ");
        numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Número inválido.");
            System.exit(0);
        }

        while ((i < numero) && !noEsPrimo) {
            if ((numero % i) == 0) {
                noEsPrimo = true;
            }
            i++;
        }

        System.out.printf((noEsPrimo)?("El número %d no es primo"):("El número %d es primo"), numero);
    }
}