public class Definir {
    public static void main(String[] args) {

        int variable1 = 10, variable2, variable3 = 20;
        boolean hayHeladas = false;
        boolean haySuspenso = true;

        double IVA_REDUCIDO = 0.1;
        final double IVA = 0.21;

        System.out.println("IVA General =" + IVA);
        System.out.println("IVA Reducido =" + IVA_REDUCIDO);

        IVA_REDUCIDO = 0.11;
        System.out.println("IVA Reducido =" + IVA_REDUCIDO);
    }
}
