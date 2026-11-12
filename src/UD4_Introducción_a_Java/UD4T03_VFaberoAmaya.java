package UD4_Introducción_a_Java;/*
Programa que lee la longitud de un radio y muestra la longitud de la circunferencia, el área del círculo y el volumen de una esfera que tiene ese radio.
20261023
Hecho por Víctor Fabero Amaya
 */

import java.util.Scanner;

public class UD4T03_VFaberoAmaya {

    public static void main(String[] args) {
        double radio, volumen, area, perimetro;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el radio de una circunferencia, te diré cuál es su perímetro, área y volumen: ");
        radio = sc.nextDouble();

        perimetro = 2 * radio * Math.PI;
        area = Math.PI * radio * radio;
        volumen = (double) 4 / 3 * Math.PI * Math.pow(radio, 3);

        System.out.println("El perímetro de tu circunferencia es igual a: " + perimetro + "\n el área es de: " + area + "\n y por último el volumen es: " + volumen);
    }
}