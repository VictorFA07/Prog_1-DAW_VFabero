package UD4_Introducción_a_Java;

import java.util.Scanner;

public class UD4T07_VFaberoAmaya_op2num {
    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Me vas a dar 2 número, yo los voy a comparar y voy a decidir cuál es mayor y cuál es menor.");
        System.out.print("Escribe el primer número: ");
        num1 = sc.nextInt();

        System.out.print("Escribe ahora el segundo número: ");
        num2 = sc.nextInt();

        System.out.println("El número mayor es = " + Math.max(num1, num2));
        System.out.println("El número menor es = " + Math.min(num1, num2));
    }
}