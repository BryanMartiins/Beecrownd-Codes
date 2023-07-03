import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        double tempGasto, velMedia;
        double litrosGasto;
        tempGasto = input.nextDouble();
        velMedia = input.nextDouble();

        litrosGasto = (velMedia / 12) * tempGasto;

        System.out.printf("%.3f \n", litrosGasto);

    }
}