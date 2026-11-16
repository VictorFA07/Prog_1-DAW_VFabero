/*
Programa que en el que el usuario «piensa» un número del 1 al 100 y el ordenador intenta adivinarlo: propone un número, el usuario le responde si el suyo es mayor (>), menor (<) o igual (=), y el ordenador vuelve a proponer, hasta acertar.
20261116
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T13_VFaberoAmaya {
    public static void main(String[] args) {

        int intento, max, min;
        boolean esIgual;
        String respuestaString;
        char respuesta;
        Scanner sc = new Scanner(System.in);

        esIgual = false;
        max = 100;
        min = 1;
        intento = 50;

        System.out.println("Piensa un número entre el 1 y el 100, el programa va a intentar adivinarlo, para ello cuando te\n pregunte, respóndele con un '>' si es mayor, con '<' si es menor o con '=' si es igual.");

        while (!esIgual) {
            System.out.printf("¿Tu número es el %d? ", intento);
            respuestaString = sc.next();
            respuesta = respuestaString.charAt(0);

            switch (respuesta) {
                case '>' -> min = intento;
                case '<' -> max = intento;
                case '=' -> esIgual = true;
                default -> System.out.println("Respuesta inválida.");
            }

            intento = (max + min) / 2;
        }

        System.out.println("Bien, acerté.");
    }
}