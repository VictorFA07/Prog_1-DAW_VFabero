package UD4_Introducción_a_Java;/*
Programa que pide la edad por teclado y muestra el mensaje «Eres mayor de edad» o el mensaje «Eres menor de edad», según corresponde.
20261030
Hecho por Víctor Fabero Amaya
 */
import java.util.Scanner;

public class UD4T06_VFaberoAmaya {

    public static void main(String[] args) {

        int age;
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca su edad para determinar si es mayor de edad o no: ");
        age = sc.nextInt();

        if (age > 125 || age < 0) {
            System.out.println("Edad no válida.");
            System.exit(0);
        }
        System.out.printf((age>=18) ? "Eres mayor de edad." : "Eres menor de edad.");
    }
}