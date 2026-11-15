/*
Programa que lee 10 números y dice cuántos son positivos y cuántos negativos.
20261113
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T07_VFaberoAmaya {
    public static void main(String[] args) {

        String enunciadoNormal, enunciadoCeros;
        boolean hayCeros;
        double numero;
        int contadorPositivos, contadorNegativos, i;
        Scanner sc = new Scanner(System.in);

        enunciadoNormal = "Hay %d números positivos y %d números negativos";
        enunciadoCeros = "Hay %d números positivos, %d números negativos y, el resto son ceros.";
        hayCeros = false;
        i = 1;
        contadorPositivos = 0;
        contadorNegativos = 0;

        System.out.println("Va a introducir 10 números y le diré cuántos números positivos, negativos y ceros ha puesto.");

        while (i <= 10) {
            i++;
            System.out.print("Introduzca un número: ");
            numero = sc.nextDouble();
            if (numero > 0) {
                contadorPositivos++;
            } else if (numero < 0) {
                contadorNegativos++;
            } else {
                hayCeros = true;
            }
        }

        System.out.printf((hayCeros) ? (enunciadoCeros) : (enunciadoNormal), contadorPositivos, contadorNegativos);
    }
}