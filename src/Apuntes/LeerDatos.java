package Apuntes;

import java.util.Scanner;

public class LeerDatos {
    public static void main(String[] args) {
        int miVariable;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un valor: ");
        miVariable = sc.nextInt();
        System.out.println("Has escrito el valor " + miVariable);
    }
}
