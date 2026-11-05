/*
Programa que lee tres números y los muestra en orden ascendente.
20261030
Hecho por Víctor Fabero Amaya
 */

import java.util.Scanner;

public class UD4T07_VFaberoAmaya {

    public static void main(String[] args) {

        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Vas a escribir 3 números y te los voy a ordenar de menor a mayor. \n Introduce el primer número: ");
        num1 = sc.nextInt();

        System.out.print("\n Introduce el segundo número: ");
        num2 = sc.nextInt();

        System.out.print("\n Introduce el tercer número: ");
        num3 = sc.nextInt();

        if ((num1 == num2) && (num2 == num3)) {
            System.out.println("El orden es: " + num1 + " " + num2 + " " + num3);
        } else {
            if ((num1 == num2) || (num1 == num3) || (num2 == num3)) {
                if (num1 == num2) {
                    if (num1 < num3) {
                        System.out.println("El orden es: " + num1 + " " + num2 + " " + num3);
                    } else {
                        System.out.println("El orden es: " + num3 + " " + num1 + " " + num2);
                    }
                }
                if (num1 == num3) {
                    if (num1 < num2) {
                        System.out.println("El orden es: " + num1 + " " + num3 + " " + num2);
                    } else {
                        System.out.println("El orden es: " + num2 + " " + num1 + " " + num3);
                    }
                }
                if (num2 == num3) {
                    if (num2 < num1) {
                        System.out.println("El orden es: " + num2 + " " + num3 + " " + num1);
                    } else {
                        System.out.println("El orden es: " + num1 + " " + num2 + " " + num3);
                    }
                }
            } else {
                if ((num1 > num2) && (num1 > num3)) {
                    if (num2 > num3) {
                        System.out.println("El orden es: " + num3 + " " + num2 + " " + num1);
                    } else {
                        System.out.println("El orden es: " + num2 + " " + num3 + " " + num1);
                    }
                }
                if ((num2 > num1) && (num2 > num3)) {
                    if (num1 > num3) {
                        System.out.println("El orden es: " + num3 + " " + num1 + " " + num2);
                    } else {
                        System.out.println("El orden es: " + num1 + " " + num3 + " " + num2);
                    }
                }
                if (num3 > num2) {
                    if (num1 > num2) {
                        System.out.println("El orden es: " + num2 + " " + num1 + " " + num3);
                    } else {
                        System.out.println("El orden es: " + num1 + " " + num2 + " " + num3);
                    }
                }
            }
        }
    }
}