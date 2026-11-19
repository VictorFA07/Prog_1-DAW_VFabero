/*
Para cada uno de estos fragmentos, haz la traza por vueltas e indica qué muestra el println final y cuántas vueltas ha dado el bucle. Todas las variables son int salvo que se diga otra cosa.
20261119
Hecho por Víctor Fabero Amaya
*/

package UD5_Bucles;

public class UD5T23_VFaberoAmaya {
    public static void main(String[] args) {

//        NUMERO 1:
        int i = 1, s = 0;
        while (i < 5) {
            s += i; i += 2;
        }
        System.out.println(i + " " + s);

//        NUMERO 2:
        int c = 0;
        for (int k = 10; k > 0; k -= 3) {
            c++;
        }
        System.out.println(c);

//        NUMERO 3:
        int x = 10;
        do {
            x -= 4;
        } while (x > 0);
        System.out.println(x);

//        NUMERO 4:
        int n = 0;
        for (int k = 1; k <= 10; k++) {
            if (k * k > 30) {
                break;
            }
            n = k;
        }
        System.out.println(n);

//        NUMERO 5:
        int t = 0;
        for (int k = 1; k <= 6; k++) {
            if (k % 3 == 0) {
                continue;
            }
            t += k;
        }
        System.out.println(t);

//        NUMERO 6:
        int v = 0;
        for (int a = 1; a <= 3; a++) {
            for (int b = a; b <= 3; b++) {
                v++;
            }
        }
        System.out.println(v);

//        NUMERO 7:
        int m = 0, w = 0;
        while (m++ < 3) {
            w += m;
        }
        System.out.println(m + " " + w);

//        NUMERO 8:
        double d = 0;
        int c2 = 0;
        while (d != 1.0 && c2 < 20) {
            d += 0.1; c2++;
        }
        System.out.println(c2);
    }
}