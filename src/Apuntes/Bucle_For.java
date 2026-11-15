package Apuntes;

public class Bucle_For {
    public static void main(String[] args) {

//        Bucle for:
//        Estructura es: for (int i = 1; i<= n; i++) {
//        -- acciones en el bucle --
//        }

        int n;

        n = 0;

        for (int i = 1; i <= n; i++) {
        }

//        La variable i si es declarada en el for solo se puede usar en él, pero si se declara fuera (como la n) se puede reutilizar. Ejs:

        for (int i = 0; i <= 20; i += 5) {} // 0, 5, 10, 15, 20.
        for (int i = 10; i >= 1; i--) {} // 10 9 … 1
        for (int i = 1, j = 10; i < j; i++, j--) {}
    }
}