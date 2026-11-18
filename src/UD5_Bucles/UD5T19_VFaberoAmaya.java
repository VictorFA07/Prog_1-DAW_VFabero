/*
Programa que lee un número y escribe el carácter * tantas veces como indica el número. Si el número no es positivo, escribirá un único asterisco.
20261118
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T19_VFaberoAmaya {
    public static void main(String[] args) {

        String cadenaAsteriscos;
        char asterisco;
        int numero, i;
        Scanner sc = new Scanner(System.in);

        cadenaAsteriscos = "";
        asterisco = '*';
        i = 1;

        System.out.print("Introduzca un número, se escribirán tantos asteriscos cómo indique el número, si es negativo solo se escribirá un asterisco: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("*");
            System.exit(0);
        }

        do {
            cadenaAsteriscos = asterisco + cadenaAsteriscos;
            i++;
        } while (i <= numero);

        System.out.println("\n"+ cadenaAsteriscos);
    }
}