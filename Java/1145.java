
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int X, Y;
        int N = 1;

        X = scanner.nextInt();
        Y = scanner.nextInt();

        for (int i = 1; i <= Y; i++) {

            System.out.print(i);

            if (i % X == 0) {
                System.out.println("");
            }

            else {
                System.out.print(" ");
            }

            if (Y % X != 0) {
                System.out.print("");
            }

        }
    }
}