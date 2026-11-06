import java.util.Scanner;

public class UD4T12_VFaberoAmaya {
    public static void main(String[] args) {

        final double EPSILON = 1e-9;
        double lado1, lado2, lado3, mayor, resto1, resto2;
        boolean ladosPositivos, formanTriangulo, tresLadosIguales;
        String eq, es, iso, enunciadoTipoTriangulo, enunciadoSiRectangulo, enunciadoSiNoRectangulo;
        Scanner sc = new Scanner(System.in);

        enunciadoTipoTriangulo = "El triángulo es:";
        enunciadoSiRectangulo = "\n Se trata de un triángulo rectángulo.";
        enunciadoSiNoRectangulo = "\n Se trata de un triángulo que no es rectángulo.";
        eq = "equilátero";
        es = "escaleno";
        iso = "isósceles";
        mayor = 0;
        resto1 = 0;
        resto2 = 0;
        tresLadosIguales = false;
        ladosPositivos = false;
        formanTriangulo = false;

        System.out.println("Teclee tres longitudes, el programa le dirá si estas longitudes forman un triángulo, de qué tipo y si es rectángulo.");
        System.out.print("Introduzca el primer lado: ");
        lado1 = sc.nextDouble();
        System.out.print("Introduzca el segundo lado: ");
        lado2 = sc.nextDouble();
        System.out.print("Introduzca el tercer lado: ");
        lado3 = sc.nextDouble();

        if ((lado1 > 0) && (lado2 > 0) && (lado3 > 0)) {
            ladosPositivos = true;
        } else {
            System.out.println("Debe de introducir longitudes positivas.");
        }

        if ((ladosPositivos) && (lado1 < (lado2 + lado3)) && (lado2 < (lado1 + lado3)) && (lado3 < (lado2 + lado1))) {
            formanTriangulo = true;
        } else {
            System.out.println("Estas longitudes no forman ningún triángulo.");
        }

        if (ladosPositivos && formanTriangulo) {
            if ((lado1 == lado2) && (lado1 == lado3)) {
                tresLadosIguales = true;
                System.out.printf("%s %s.", enunciadoTipoTriangulo, eq);
            } else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
                System.out.printf("%s %s.", enunciadoTipoTriangulo, iso);
            } else {
                System.out.printf("%s %s.", enunciadoTipoTriangulo, es);
            }

            if ((lado1 > lado2) && (lado1 > lado3)) {
                mayor = lado1;
                resto1 = lado2;
                resto2 = lado3;
            } else if ((lado2 > lado1) && (lado2 > lado3)) {
                mayor = lado2;
                resto1 = lado1;
                resto2 = lado3;
            } else if ((lado3 > lado1) && (lado3 > lado2)) {
                mayor = lado3;
                resto1 = lado1;
                resto2 = lado2;
            }
            if (!tresLadosIguales && Math.abs(((mayor * mayor) - ((resto1 * resto1) + (resto2 * resto2)))) < EPSILON) {
                System.out.printf("%s", enunciadoSiRectangulo);
            } else {
                System.out.printf("%s", enunciadoSiNoRectangulo);
            }
        }
    }
}