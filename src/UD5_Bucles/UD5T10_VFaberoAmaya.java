/*
Programa que lee una secuencia de notas, con valores de 0 a 10, que termina con el valor −1, e indica si hubo o no alguna nota con valor 10.
20261113
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T10_VFaberoAmaya {
    public static void main(String[] args) {

        String siDiez, noDiez;
        double nota;
        boolean hayDiez;
        Scanner sc = new Scanner(System.in);

        siDiez = "Hay algún 10 entre las notas que has introducido.";
        noDiez = "No hay ningún 10 entre las notas que has introducido";
        hayDiez = false;

        System.out.println("Va a introducir notas en el programa y este indicará si hubo algún 10.");

        do {
            System.out.print("Introduzca una nota: ");
            nota = sc.nextDouble();
            if (((nota < 0) && (nota != -1)) || (nota > 10)) {
                System.out.println("Nota no válida.");
            }
            if (nota == 10) {
                hayDiez = true;
            }
        } while (nota != -1);

        System.out.printf((hayDiez)?(siDiez):(noDiez));
    }
}