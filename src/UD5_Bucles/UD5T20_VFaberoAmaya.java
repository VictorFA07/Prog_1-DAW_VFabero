/*
Programa que pide un número entero N entre 0 y 20 y muestra los números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su valor.
20261118
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T20_VFaberoAmaya {
    public static void main(String[] args) {

        String cadenaNumeros;
        char numeroChar;
        int numero, i;
        Scanner sc = new Scanner(System.in);

        i = 1;
        cadenaNumeros = " ";

        System.out.print("Introduzca un número entre el 1 y el 20 y verá que ocurre: ");
        numero = sc.nextInt();

        if ((numero < 1) || (numero > 20)) {
            System.out.println("Número no válido.");
            System.exit(0);
        }

        while (i <= numero) {
            numeroChar = (char) i;
            cadenaNumeros = cadenaNumeros + numeroChar;
            System.out.printf("%s%n", cadenaNumeros);
            i++;
        }
    }
}