/*
Programa que lee una hora expresada en horas, minutos y segundos, calcula y muestre la hora que será un segundo después.
20261030
Hecho por Víctor Fabero Amaya
 */
import java.util.Scanner;

public class UD4T09_VFaberoAmaya {

    public static void main(String[] args) {

        int hora, min, seg;
        String enunciado = "Serán las %d : %d : %d.";
        Scanner sc = new Scanner(System.in);

        System.out.println("Va a introducir una hora, y el programa le va a decir que hora será dentro de un segundo.");
        System.out.print("Introduzca la hora: ");
        hora = sc.nextInt();

        System.out.print("\n \"Introduzca los minutos: ");
        min = sc.nextInt();

        System.out.print("\n Introduzca los segundos: ");
        seg = sc.nextInt();

        if (seg < 59) {
            seg++;
            System.out.printf(enunciado,hora, min, seg);
        } else if (min < 59) {
            seg = 00;
            min++;
            System.out.printf(enunciado,hora, min, seg);
        } else if (hora < 23) {
            seg = 0;
            min = 0;
            hora++;
            System.out.printf(enunciado,hora, min, seg);
        } else {
            seg = 0;
            min = 0;
            hora = 0;
            System.out.println("Serán las 00:00:00");
        }
    }
}