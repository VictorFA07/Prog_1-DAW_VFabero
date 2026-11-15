package Apuntes;

public class Prueba_Bucle_For {
    public static void main(String[] args) {

        int i;

        System.out.println("Empiezo a ejecutar el bucle.");

        for (i = 1; i <= 10; i++) {
            System.out.printf("Estoy en la ejecución %d%n", i);
        }
//      Primero hace la operación de i (suma 1) y después decide si entrar o no al bucle según la condición.

        System.out.println("Ya he acabado el bucle.");
//      ¿Qué valor tiene i al acabar el bucle?
        System.out.printf("La variable i vale %d%n.", i);

        for (i = 1; i <= 10; i--) {
            System.out.printf("Estoy en la ejecución %d%n", i);
        }
//        Esto sería un bucle infinito sin fin
    }
}