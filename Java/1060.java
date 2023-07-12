import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double X, cont = 0;

        for (int i = 1; i < 7; i++) {

            X = input.nextDouble();

            if (X > 0.0) {
                cont++;
            }

        }
        System.out.printf("%.0f valores positivos\n", cont);

    }
}