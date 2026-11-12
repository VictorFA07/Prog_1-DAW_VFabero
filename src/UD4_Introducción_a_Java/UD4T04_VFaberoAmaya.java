package UD4_Introducción_a_Java;/*
Programa que, dado el precio de un artículo y su precio de venta real, muestra el porcentaje de descuento que se ha aplicado.
20261030
Hecho por Víctor Fabero Amaya
 */
import java.util.Scanner;

public class UD4T04_VFaberoAmaya {

    public static void main(String[] args) {

        double descuento, p_Art, p_Venta;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba el precio del artículo: ");
        p_Art = sc.nextDouble();

        System.out.print("\n Escriba ahora su precio de venta real: ");
        p_Venta = sc.nextDouble();

        descuento = (1 - p_Venta / p_Art) * 100;

        System.out.printf("\n El descuento del producto que me has dicho es del: %.2f %%.", descuento);
    }
}