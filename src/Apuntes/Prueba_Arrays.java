package Apuntes;

import java.util.Scanner;

public class Prueba_Arrays {
    public static void main(String[] args) {

        int edad, cantidadExamenes;
        int[] calificaciones;
        Scanner sc = new Scanner(System.in);
//        calificaciones = new int[50];

//        System.out.print("Dime tu edad: ");
//        edad = sc.nextInt();
//
//        for (int i = 0; i < 5; i++) {
//            System.out.printf("Nota examen %d: ", i + 1);
//            calificaciones [i] = sc.nextInt();
//        }

//        System.out.print("Nota examen 1: ");
//        calificaciones[0] = sc.nextInt();
//
//        System.out.print("Nota examen 2: ");
//        calificaciones[1] = sc.nextInt();
//
//        System.out.print("Nota examen 3: ");
//        calificaciones[2] = sc.nextInt();
//
//        System.out.print("Nota examen 4: ");
//        calificaciones[3] = sc.nextInt();
//
//        System.out.print("Nota examen 5: ");
//        calificaciones[4] = sc.nextInt();

//        System.out.printf("Tus notas son: %d, %d, %d, %d, %d.", calificaciones[0], calificaciones[1], calificaciones[2], calificaciones[3], calificaciones[4]);

        System.out.print("¿Cuántos exámenes has hecho?");
        cantidadExamenes = sc.nextInt();
        calificaciones = new int[cantidadExamenes];

        for (int i = 0; i < cantidadExamenes; i++) {
            System.out.printf("Nota examen %d: ", i + 1);
            calificaciones[i] = sc.nextInt();
        }

        System.out.printf("Tus notas son:%n");
        for (int i = 0; i < cantidadExamenes; i++) {
            System.out.printf("     Nota examen %d = %d%n", i + 1, calificaciones[i]);
        }

    }
}