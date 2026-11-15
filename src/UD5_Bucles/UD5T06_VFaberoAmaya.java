/*
Programa que lee 10 números y dice si alguno era negativo.
20261113
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T06_VFaberoAmaya {
    public static void main(String[] args) {

        String enunciadoSi, enunciadoNo;
        boolean hayNegativo;
        double numero;
        int i;
        Scanner sc = new Scanner(System.in);

        enunciadoSi = "Hay algún número negativo.";
        enunciadoNo = "No hay ningún número negativo.";
        hayNegativo = false;
        i = 1;

        System.out.println("Va a introducir 10 números y el programa le mostrará si alguno de ellos era negativo.");

        while (i <= 10) {
            i++;
            System.out.print("Introduzca un número: ");
            numero = sc.nextDouble();
            if (numero < 0) {
                hayNegativo = true;
            }
        }

        System.out.println((hayNegativo) ? (enunciadoSi) : (enunciadoNo));
    }
}