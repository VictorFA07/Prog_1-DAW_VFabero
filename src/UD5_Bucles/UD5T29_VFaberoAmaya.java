/*
Programa que lee un número entero y muestra cuántas cifras tiene, cuánto suman y cómo se escribe al revés.
20261125
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T29_VFaberoAmaya {
    public static void main(String[] args) {

        String numeroAlReves;
        double numero, cifra;
        int suma, i;
        Scanner sc = new Scanner(System.in);

        i = 0;
        suma = 0;
        numeroAlReves = "";

        System.out.print("Introduce un número entero, le diré cuántas cifras tiene, el producto de estas, y como se escribe al revés: ");
        numero = sc.nextInt();

        while (numero != 0) {
            if ((numero % 10) == 0) {
                cifra = 0;
                numero = numero / 10;
            } else {
                cifra = ((numero / 10) - ((int)numero / 10)) * 10;
                suma += (int)cifra;
                numero = (int)numero / 10;
            }
            numeroAlReves = numeroAlReves + (int)cifra;
            i++;
        }
        System.out.printf("El número tiene %d cifras.%n", i);
        System.out.printf("La suma de sus cifras es %d.%n", suma);
        System.out.printf("El número del revés se escribe así: %s.", numeroAlReves);
    }
}