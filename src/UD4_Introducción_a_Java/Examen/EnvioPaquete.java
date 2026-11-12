package UD4_Introducción_a_Java.Examen;/*
 * Programa que calcula el coste de envío de un paquete esn base a su destino, peso y, si es urgente o no.
 * Hecho por Víctor Fabero Amaya
 * Datos de entrada: nombre destinatario, zona de entrega, peso del paquete y urgencia de la entrega.
 * Datos de salida: tarifa base, recargo de peso, recargo de urgencia, total.
 * 20261109
 */

import java.util.Scanner;

public class EnvioPaquete {
    static void main(String[] args) {

        final int TARIFA_PENINSULA, TARIFA_BALEARES, TARIFA_CANARIAS;
        String nombreCompleto;
        char zona, urgente;
        int peso;
        double tarifaBase, recargo, extraUrgencia, total;
        boolean esUrgente;
        Scanner sc = new Scanner(System.in);

        TARIFA_PENINSULA = 5;
        TARIFA_BALEARES = 8;
        TARIFA_CANARIAS = 12;

        esUrgente = false;
        recargo = 0;
        extraUrgencia = 0;

        System.out.print("Introduzca el nombre del destinatario del paquete: ");
        nombreCompleto = sc.nextLine();
        System.out.print("Seleccione ahora la zona de destino: península, Baleares o Canarias: ");
        zona = sc.next().charAt(0);
        zona = Character.toUpperCase(zona);
        System.out.print("Introduzca ahora el peso, en kilos del paquete: ");
        peso = sc.nextInt();
        System.out.print("¿El envío es urgente? Responda con sí o no: ");
        urgente = sc.next().charAt(0);
        urgente = Character.toUpperCase(urgente);

        tarifaBase = switch (zona) {
            case 'P' -> TARIFA_PENINSULA;
            case 'B' -> TARIFA_BALEARES;
            case 'C' -> TARIFA_CANARIAS;
            default -> 0;
        };

        if (tarifaBase == 0) {
            System.out.println("Ha introducido una zona inválida.");
            System.exit(0);
        }

        if ((peso >= 3) && (peso <= 10)) {
            recargo = 3;
        } else if ((peso > 10) && (peso <= 30)) {
            recargo = 7;
        } else if ((peso != 1) && (peso != 2)) {
            System.out.println("Peso no válido.");
            System.exit(0);
        }

        if (urgente == 'S') {
            esUrgente = true;
            extraUrgencia = (recargo + tarifaBase) / 2;
        }

        total = tarifaBase + recargo + extraUrgencia;

        System.out.printf("Destinatario: %s.%n", nombreCompleto);
        System.out.printf("Zona (P/B/C): %c.%n", zona);
        System.out.printf("Peso (kg): %d.%n", peso);
        System.out.printf("Urgente (S/N): %s.%n", (esUrgente) ? ("S") : ("N"));
        System.out.printf("Envío para %s (zona %c).%n", nombreCompleto, zona);
        System.out.printf("%-16s%8d kg%n", "Peso", peso);
        System.out.printf("%-16s%8.2f €%n", "Tarifa base", tarifaBase);
        System.out.printf("%-16s%8.2f €%n", "Recargo peso", recargo);
        System.out.printf("%-16s%8.2f €%n", "Urgencia", extraUrgencia);
        System.out.printf("%-16s%8.2f €%n", "TOTAL", total);
    }
}