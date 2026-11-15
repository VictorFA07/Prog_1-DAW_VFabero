package UD4_Introducción_a_Java;/*
Programa que lee los coeficientes a, b y c de la ecuación ax² + bx + c = 0 y muestra sus soluciones reales, con dos decimales.
20261105
Hecho por Víctor Fabero Amaya
 */

import java.util.Scanner;

public class UD4T11_VFaberoAmaya {
    public static void main(String[] args) {

        double a, b, c, x, x1, x2, discriminante;
        String enunciadoDosSol, enunciadoUnaSol, enunciadoPrimerGrado;
        Scanner sc = new Scanner(System.in);

        enunciadoUnaSol = "Una solución doble: x = %.2f.";
        enunciadoDosSol = "Dos soluciones: x1 = %.2f y x2 = %.2f.";
        enunciadoPrimerGrado = "Es de primer grado, x = %.2f.";

        System.out.println("Para resolver una ecuación de segundo grado vas a darme 3 números, el a, b y c, que acompañan a x², x y el factor libre respectivamente.");
        System.out.print("Empieza introduciendo a: ");
        a = sc.nextDouble();
        System.out.print("\n Pasa ahora a introducir b: ");
        b = sc.nextDouble();
        System.out.print("\n Por último introduce c: ");
        c = sc.nextDouble();

        discriminante = (b * b) - (4 * a * c);

        if (((a == b) && (a == c)) && (a == 0)) {
            System.out.println("Cualquier número es solución.");
        } else if ((a == 0) && (b == 0) && (c != 0)) {
            System.out.println("No tiene solución.");
        } else if ((a == 0) && (b != 0)) {
            x = -c / b;
            System.out.printf(enunciadoPrimerGrado, x);
        } else if (discriminante > 0) {
            x1 = (-b + (Math.sqrt(discriminante))) / (2 * a);
            x2 = (-b - (Math.sqrt(discriminante))) / (2 * a);
            System.out.printf(enunciadoDosSol, x1, x2);
        } else if (discriminante == 0) {
            x = -b / (2 * a);
            System.out.printf(enunciadoUnaSol, x);
        } else {
            System.out.println("No tiene soluciones reales.");
        }
    }
}