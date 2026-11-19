/*
El contrario del ejercicio 13: el ordenador «piensa» un número del 1 al 100 con Random, que viste en la unidad 4, y el usuario lo adivina en un máximo de 7
intentos. Después de cada propuesta el programa dice «demasiado alto» o «demasiado bajo». Las propuestas que no son un número o están fuera del rango se
rechazan sin que el programa se detenga y sin contar como intento.
20261119
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Random;
import java.util.Scanner;

public class UD5T25_VFaberoAmaya {
    public static void main(String[] args) {

        String enunciado;
        boolean esCorrecto;
        int numero, intento, i;
        Scanner sc = new Scanner(System.in);

        enunciado = "Llevas %d intentos.";
        esCorrecto = false;
        i = 1;
        numero = (int) (Math.random() * 100) + 1;

        System.out.println("Estoy pensando en un número entre 1 y 100, tienes 7 intentos para adivinarlo.");

        do {
            System.out.print("Intento " + i + ": ");

            while ((!sc.hasNextInt())) {
                System.out.println("Error, debes de introducir un número entero entre 1 y 100. Inténtalo de nuevo");
                sc.next();
            }

            intento = sc.nextInt();

            if (intento < 1 || intento > 100) {
                System.out.println("Error, debes de introducir un número entero entre 1 y 100. Inténtalo de nuevo");
            } else if (intento > numero) {
                System.out.println("Demasiado alto.");
                i++;
            } else if (intento < numero) {
                System.out.println("Demasiado bajo.");
                i++;
            } else {
                esCorrecto = true;
            }
        } while ((!esCorrecto) && (i <= 7));

        if (esCorrecto) {
            System.out.printf("Acertaste, el número era el %d.", numero);
        } else {
            System.out.printf("Te quedaste sin intentos, el número era el %d.", numero);
        }
    }
}