void main() {

    boolean bandera;
    Scanner sc = new Scanner(System.in);
    String salida;
    int uds;

    System.out.println("Dime si sí o si no: ");

    bandera = sc.nextBoolean();

    System.out.printf("Resultado %s", (bandera) ? "Sí" : "No");
}