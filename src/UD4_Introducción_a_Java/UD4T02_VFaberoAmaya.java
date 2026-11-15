package UD4_Introducción_a_Java;

import java.util.Scanner;

/*
Programa que calcula y muestra el área de un cuadrado de lado igual a lo que decida el usuario.
20261023
Hecho por Víctor Fabero Amaya
 */
public class UD4T02_VFaberoAmaya {
    public static void main(String[] args) {
        int lado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime de cuánto es el lado del cuadrado: ");
        lado = sc.nextInt();
        System.out.println("El área de tu cuadrado es igual a " + lado * lado);
    }
}