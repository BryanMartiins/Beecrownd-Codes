import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int X, Y, fora = 0, dentro = 0;

        X = input.nextInt();

        for (int i = 1; i <= X; i++) {
            Y = input.nextInt();

            if (Y >= 10 && Y <= 20) {

                dentro++;
            }

            else {
                fora++;
            }
        }
        System.out.printf("%d in\n", dentro);
        System.out.printf("%d out\n", fora);

    }
}