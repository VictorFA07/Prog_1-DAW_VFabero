/*
Calculadora con menú que se repite hasta que se elige salir. Los dos números se piden una sola vez, antes de la operación, la división entre cero se avisa en vez de calcularse; una opción que no exista se rechaza; y una opción que no sea un número se rechaza sin que el programa se detenga.
20261123
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T27_VFaberoAmaya {
    public static void main(String[] args) {

        boolean esSuma, esResta, esProducto, esDivision, esSalir, esError;
        String opcion, errorNumero;
        double numero1, numero2, solucion;
        Scanner sc = new Scanner(System.in);

        esSuma = false;
        esResta = false;
        esProducto = false;
        esDivision = false;
        esError = false;
        esSalir = false;
        errorNumero = "Por favor, introduzca un número válido.";

        System.out.println("Estás ante una calculadora, dime qué dos números vas a querer usar para las operaciones.");

        System.out.print("Primer número: ");

        while (!sc.hasNextDouble()) {
            System.out.println(errorNumero);
            sc.next();
        }

        numero1 = sc.nextDouble();

        System.out.print("Segundo número: ");

        while (!sc.hasNextDouble()) {
            System.out.println(errorNumero);
            sc.next();
        }

        numero2 = sc.nextDouble();

        do {
            System.out.print("\nDime ahora que operación desea realizar; suma, resta, producto, o division, para salir, tan solo escriba 'salir': ");
            opcion = sc.next().toUpperCase();

            switch (opcion) {
                case "SUMA" -> esSuma = true;
                case "RESTA" -> esResta = true;
                case "PRODUCTO" -> esProducto = true;
                case "DIVISION" -> esDivision = true;
                case "SALIR" -> esSalir = true;
                default -> esError = true;
            }

            if (esSuma) {
                solucion = numero1 + numero2;
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, solucion);;
                esSuma = false;
            }

            if (esResta) {
                solucion = numero1 - numero2;
                System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, solucion);;
                esResta = false;
            }

            if (esProducto) {
                solucion = numero1 * numero2;
                System.out.printf("%.2f · %.2f = %.2f", numero1, numero2, solucion);;
                esProducto = false;
            }

            if (esDivision) {
                if (numero2 != 0) {
                    solucion = numero1 / numero2;
                    System.out.printf("%.2f · %.2f = %.2f", numero1, numero2, solucion);;
                } else {
                    System.out.println("No se puede dividir entre 0.");
                }
                esDivision = false;
            }

            if (esError) {
                System.out.println("Opción incorrecta, por favor, elija una operación válida.");
                esError = false;
            }

        } while (!esSalir);
    }
}