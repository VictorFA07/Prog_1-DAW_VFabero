/*
Programa que lee un número positivo y muestra su factorial.
20261112
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T05_VFaberoAmaya {
    public static void main(String[] args) {

        String enunciado;
        int numero, resultado, i;
        Scanner sc = new Scanner(System.in);

        enunciado = "El factorial %d! vale: %d";
        i = 1;
        resultado = 1;

        System.out.print("Introduzca un número y el programa calculará su factorial: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Debe introducir un número entero positivo.");
            System.exit(0);
        } else if (numero == 0) {
            System.out.println("El resultado de 0! siempre es 1.");
            System.exit(0);
        }

        do {
            resultado = i * resultado;
            i++;
        } while (i <= numero);

        System.out.printf(enunciado, numero, resultado);
    }
}