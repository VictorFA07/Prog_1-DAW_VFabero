/*
Programa que lee una calificación numérica entre 0 y 10 y la transforma en calificación alfabética.
20261030
Hecho por Víctor Fabero Amaya
 */
import java.util.Scanner;

public class UD4T08_VFaberoAmaya {

    public static void main(String[] args) {

        double nota;
        String enunciado = "Tu nota es: ";
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba su nota numérica para saber el resultado: ");
        nota = sc.nextDouble();

        if (nota < 3) {
            System.out.println(enunciado + "Muy deficiente.");
        } else if (nota < 5) {
            System.out.println(enunciado + "Insuficiente.");
        } else if (nota < 6) {
            System.out.println(enunciado + "Bien.");
        } else if (nota < 9) {
            System.out.println(enunciado + "Notable.");
        } else if (nota <= 10) {
            System.out.println(enunciado + "Sobresaliente.");
        }
    }
}