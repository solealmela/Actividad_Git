public class Conversor {
    public static void main(String[] args) {
        double euros = 100;
        double tasaCambio = 1.10;
        double dolares = euros * tasaCambio;

        System.out.println("Inicio del Conversor");
        System.out.println(euros + " EUR son " + dolares + " USD");
        System.out.println("Conversión ejecutada con éxito");
    }
}
