/*
Programa que lee un número positivo, muestra sus divisores propios y dice si es perfecto; y que después pide un límite y muestra todos los números perfectos hasta él.
20261123
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

import java.util.Scanner;

public class UD5T26_VFaberoAmaya {
    public static void main(String[] args) {

        String enunciado;
        int numeroPedido, limite, sumaDivisores1, i, numeroPerfecto, j, k, sumaDivisores2;
        Scanner sc = new Scanner(System.in);

        enunciado = "es un número perfecto.";
        i = 1;
        j = 1;
        sumaDivisores1 = 0;

        do {
            System.out.print("Dame un número entero positivo, te diré si es un número perfecto y te mostraré sus divisores: ");
            numeroPedido = sc.nextInt();
        } while (numeroPedido <= 0);

        while (i < numeroPedido) {
            if ((numeroPedido % i) == 0) {
                System.out.println("Un divisor es el " + i);
                sumaDivisores1 += i;
            }
            i++;
        }

        System.out.printf((sumaDivisores1 == numeroPedido)?("Sí %s"):("No %s"), enunciado);

        do {
            System.out.println("\nDame ahora un número límite y te mostraré todos los números perfectos que hay hasta él.");
            limite = sc.nextInt();
        } while (limite <= 0);

        while (j < limite) {
            k = 1;
            sumaDivisores2 = 0;
            while (k < j) {
                if ((j % k) == 0) {
                    sumaDivisores2 += k;
                }
                k++;
            }
            if (sumaDivisores2 == j) {
                System.out.printf("%d %s%n", j, enunciado);
            }
            j++;
        }
    }
}