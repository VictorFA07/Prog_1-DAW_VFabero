package UD4_Introducción_a_Java;/*
Programa que calcula el salario neto semanal, el bruto y los impuestos de un trabajador en función de las horas trabajadas y de la tarifa por hora.
20261105
Hecho por Víctor Fabero Amaya
 */

import java.util.Scanner;

public class UD4T10_VFaberoAmaya {
    public static void main(String[] args) {

        String nombre, enunciadoSalarioBruto, enunciadoImpuestos;
        double salarioBruto, salarioNeto, impuestos, horas, tarifa;
        Scanner sc = new Scanner(System.in);

        enunciadoImpuestos = "\n Impuestos: %.2f €.";
        enunciadoSalarioBruto = "\n Salario Bruto: %.2f €.";

        System.out.println("Introduzca el nombre del empleado seguido de sus horas trabajadas y su tarifa, el programa calculará su salario bruto, neto y los impuestos a pagar.");
        System.out.print("Introduzca ahora el nombre del empleado: ");
        nombre = sc.next();
        System.out.print("Introduzca ahora las horas que ha trabajado el empleado: ");
        horas = sc.nextDouble();
        System.out.print("Introduzca ahora la tarifa del empleado: ");
        tarifa = sc.nextDouble();

        System.out.print("Trabajador: " + nombre);

        if (horas > 35) {
            salarioBruto = (35 * tarifa) + ((horas - 35) * 1.5 * tarifa);
        } else {
            salarioBruto = horas * tarifa;
        }

        System.out.printf(enunciadoSalarioBruto, salarioBruto);


        if (salarioBruto <= 500) {
            impuestos = 0;
        } else if (salarioBruto <= 900) {
            impuestos = (salarioBruto - 500) * 0.25;
        } else {
            impuestos = (salarioBruto - 500 - 400) * 0.45 + (400 * 0.25);
        }

        System.out.printf(enunciadoImpuestos, impuestos);

        salarioNeto = salarioBruto - impuestos;
        System.out.printf("\n Salario neto: %.2f €.", salarioNeto);
    }
}