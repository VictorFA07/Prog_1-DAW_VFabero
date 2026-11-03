/*
Programa que lee una distancia en millas marinas y la muestra en metros, sabiendo que una milla marina equivale a 1852 metros.
20261030
Hecho por Víctor Fabero Amaya
 */
import java.util.Scanner;

public class UD4T05_VFaberoAmaya {

    public static void main(String[] args) {

        double millas, metros;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba una distancia en millas y la pasaré a metros: ");
        millas = sc.nextDouble();

        metros = millas * 1852;

        System.out.printf("\n La distancia que has introducido en millas equivale a %.2f metros.", metros);
    }
}