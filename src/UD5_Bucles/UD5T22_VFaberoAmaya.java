/*
Programa que pida un número y construye por pantalla una pirámide de asteriscos con tantas filas como indica.
20261119
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T22_VFaberoAmaya {
    public static void main(String[] args) {

        char asterisco, espacio;
        int nFilas, contadorFilas, nAsteriscos, nEspacios, filasRestantes;
        Scanner sc = new Scanner(System.in);

        asterisco = '*';
        espacio = ' ';

        contadorFilas = 1;

        System.out.print("Introduzca el número de filas que desea que tenga la pirámide: ");
        nFilas = sc.nextInt();

        filasRestantes = nFilas;

        while (contadorFilas <= nFilas) {
            nEspacios = filasRestantes - 1;
            nAsteriscos = ((nFilas - nEspacios) * 2) - 1;
            while (nEspacios > 0) {
                System.out.print(espacio);
                nEspacios--;
            }
            while (nAsteriscos > 0) {
                System.out.print(asterisco);
                nAsteriscos--;
            }
            System.out.println(" ");
            contadorFilas++;
            filasRestantes--;
        }
    }
}