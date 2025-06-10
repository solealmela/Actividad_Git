public class Conversor {
    public static void main(String[] args) {
        double euros = 100;
        double tasaCambio = 1.10; // EUR a USD
        double dolares = euros * tasaCambio;

        System.out.println(euros + " EUR son " + dolares + " USD");
    }
}
