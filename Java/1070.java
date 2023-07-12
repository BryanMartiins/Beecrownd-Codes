import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int X, cont = 0;
        
        X = input.nextInt();

        while (cont < 6) {

            if (X % 2 == 1) {
                System.out.println(X);
                cont++;
            }
            X++;
        }
    }
}