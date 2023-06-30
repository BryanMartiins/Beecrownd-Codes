import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int raio;
        double volume;

        raio = sc.nextInt();

        volume = (4.0/3)* 3.14159* Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n",volume);
    }
}