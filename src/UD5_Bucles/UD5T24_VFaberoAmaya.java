/*
Este programa debe leer números hasta que se introduzca un 0 y mostrar la media de los positivos con dos decimales.
20261119
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T24_VFaberoAmaya {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero, cuantos;
        double suma = 0;

        // Faltaba inicializar la variable cuantos así que lo hacemos aquí:
        cuantos = 0;

        System.out.print("Número (0 para terminar): ");
        numero = entrada.nextInt();

        // Aquí, junto al while sobra el ";" y falta hacer que la variable número cambie de valor en el bucle, para esto meteremos una copia del
        // Scanner dentro del bucle.
        while (numero != 0) {
            numero = entrada.nextInt();
            if (numero > 0) {
                suma += numero;
                cuantos++;
            }
            // Otro fallo era que el contador de positivos, la variable cuantos estaba fuera del if donde se tiene en cuenta esta condición, asi que también contaba números negativos.
        }

        if (cuantos == 0) {
            System.out.println("Error, no has introducido ningún número válido.");
            System.exit(0);
        }
        // En la linea de abajo falta un ";" al final de la linea.
        System.out.printf("Media de los positivos: %.2f%n", suma / cuantos);
    }
}