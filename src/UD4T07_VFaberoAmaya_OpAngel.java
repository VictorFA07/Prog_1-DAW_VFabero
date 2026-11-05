import java.util.Scanner;

public class UD4T07_VFaberoAmaya_OpAngel {

    public static void main(String[] args) {

        int num1, num2, num3, mayor, menor, medio;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el primer número = ");
        num1 = sc.nextInt();

        System.out.print("Escribe el segundo número = ");
        num2 = sc.nextInt();

        System.out.print("Escribe el tercer número = ");
        num3 = sc.nextInt();

        mayor = Math.max(num1, Math.max(num2, num3));
        menor = Math.min(num1, Math.min(num2, num3));
        medio = num1 + num2 + num3 - mayor - menor;

        System.out.printf("El orden es: %d, %d, %d", menor, medio, mayor);

    }
}