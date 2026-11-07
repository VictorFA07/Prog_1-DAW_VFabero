import java.util.Scanner;
/**
 * Lee DNI y verifica si la letra es correcta o no.
 *
 * @author Paola Mateos Huerta
 * @version 1.0
 * @since 06/11/2026
 * <p>
 * Entrada de datos: numdni, letradni
 * Salida de datos: letra es correcta o no
 */

public class UD4T13_Paola {
    public static void main (String[] args){
        /*
        ------DEFINICION Y ASIGNACION------
         */
        final String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
        int identificador, resto;
        char letraDni;
        String dni, aux;
        Scanner sc = new Scanner(System.in);
        /*
        ------ENTRADA DE DATOS------
         */
        System.out.println("Introduce dni:");
        dni = sc.next();
        // sacar la letra de dni
        letraDni = dni.charAt((dni.length()-1));
        // sacar la parte numerica y pasarla a entero
        aux = dni.replaceAll("[^0-9]","");
        identificador = Integer.parseInt(aux);
        /*
        ------CALCULOS------
         */
        letraDni = Character.toUpperCase(letraDni);
        resto = identificador%23;
        if(letraDni == cadena.charAt(resto)){
            System.out.println("Letra correcta");
        }else{
            System.out.printf("La letra no es correcta: debería ser la %s", cadena.charAt(resto));
        }
    }
}