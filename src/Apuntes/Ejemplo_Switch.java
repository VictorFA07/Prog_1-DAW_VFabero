package Apuntes;

import java.util.Scanner;

public class Ejemplo_Switch {
    public static void main(String[] args) {

        int diaSemana;
//        String texto;
        boolean esFinDeSemana;
        Scanner sc = new Scanner(System.in);

        System.out.print("Día de la semana (1 = lunes, 7 = domingo):");
        diaSemana = sc.nextInt();

        esFinDeSemana = switch (diaSemana) {
            case 1, 2, 3, 4, 5 -> true;
            default -> false;
        };

//        texto = switch (diaSemana) {
//            case 1, 2, 3, 4, 5 -> "Es entre semana";
//            case 6, 7 -> "Es finde";
//            default -> "No existe";

//        switch (diaSemana){
//            case 1, 2, 3, 4, 5 -> System.out.println("Es entre semana");
//            case 6, 7 -> System.out.println("Es finde");
//            default -> System.out.println("No existe");
//        }


//        switch (diaSemana){
//            case 1:
//                System.out.println("Es lunes");
//                break;
//            case 2:
//                System.out.println("Es martes");
//                break;
//            case 3:
//                System.out.println("Es miércoles");
//                break;
//            case 4:
//                System.out.println("Es jueves");
//                break;
//            case 5:
//                System.out.println("Es viernes");
//                break;
//            case 6:
//                System.out.println("Es sábado");
//                break;
//            case 7:
//                System.out.println("Es domingo");
//                break;
//            default:
//                System.out.println("No existe");
//        }

//        switch (diaSemana){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Es entra semana");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Es finde");
//                break;
//            default:
//                System.out.println("No existe");
//        }

//        switch (diaSemana){
//            case 1, 2, 3, 4, 5:
//                System.out.println("Es entra semana");
//                break;
//            case 6, 7:
//                System.out.println("Es finde");
//                break;
//            default:
//                System.out.println("No existe");
//        }


//        char diaSemana;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Día de la semana (l=lunes, x=miércoles, d=domingo): ");
//        diaSemana = sc.next().charAt(0);
//
//        switch (diaSemana){
//            case 'l', 'm', 'x', 'j', 'v' -> System.out.println("Es entre semana");
//            case 's', 'd' -> System.out.println("Es finde");
//            default -> System.out.println("No existe");
//        }
        }
    }