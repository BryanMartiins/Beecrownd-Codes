import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int X, Y;

        for (int i = 1; i > 0; i++) {

            X = input.nextInt();
            Y = input.nextInt();

            if (X > Y) {
                System.out.println("Decrescente");
            } else if (X < Y) {
                System.out.println("Crescente");
            } else {
                return;
            }
        }
    }
}