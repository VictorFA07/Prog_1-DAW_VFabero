/*
Programa que muestra y cuenta los múltiplos de 3 desde el 1 hasta un número que se introduce por teclado.
20261116
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T15_VFaberoAmaya {
    public static void main(String[] args) {

        boolean esNegativo;
        int numero, i, contador, suma;
        Scanner sc = new Scanner(System.in);

        esNegativo = false;
        contador = 0;
        suma = 0;

        System.out.print("Introduce un número y mostraré cuáles y cuántos múltiplos de 3 hay desde el 3 hasta dicho número: ");
        numero = sc.nextInt();
        if (numero < 0) {
            esNegativo = true;
        }

        if (esNegativo) {
            for (i = 0; i >= numero; i = i - 3) {
                contador++;
                System.out.print(i + " ");
                suma += i;
            }
            System.out.printf("Entre el 1 y %d había %d múltiplos de 3 y la suma de todos ellos es %d.", numero, contador, suma);
            System.exit(0);
        }

        for (i = 0; i <= numero; i = i + 3) {
            contador++;
            System.out.print(i + " ");
            suma += i;
        }
        System.out.printf("Entre el 1 y %d había %d múltiplos de 3 y la suma de todos ellos es %d.", numero, contador, suma);
    }
}