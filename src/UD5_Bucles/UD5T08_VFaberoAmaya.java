/*
Programa que lee una secuencia de números hasta que se introduzca un 0, y muestra si se ha leído algún número negativo, cuántos positivos había y cuántos negativos.
20261113
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T08_VFaberoAmaya {
    public static void main(String[] args) {

        String enunciado;
        boolean hayNegativo;
        double numero;
        int contadorPositivos, contadorNegativos;
        Scanner sc = new Scanner(System.in);

        contadorNegativos = 0;
        contadorPositivos = 0;
        hayNegativo = false;
        enunciado = " hay números negativos. Son %d números negativos y %d números positivos.";

        System.out.println("Introduzca números, cuando introduzca un 0 el programa finalizará su ejecución y le dirá: \nsi ha introducido números negativos, cuántos, y cuántos positivos.");

        do {
            System.out.print("Introduzca un número: ");
            numero = sc.nextDouble();
            if (numero < 0) {
                hayNegativo = true;
                contadorNegativos++;
            } else if (numero > 0) {
                contadorPositivos++;
            }
        } while (numero != 0);

        System.out.printf((hayNegativo) ? ("Sí " + enunciado) : ("No " + enunciado), contadorPositivos, contadorNegativos);
    }
}