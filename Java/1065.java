import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double X, cont = 0;

        for (int i = 1; i < 6; i++) {

            X = input.nextDouble();

            if (X %2 == 0) {
                cont++;
            
            }
            
        }

        System.out.printf("%.0f valores pares\n",cont);
    }
}