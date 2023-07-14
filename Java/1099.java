import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N, X, Y, soma = 0, MAX, MIN;

        N = input.nextInt();

        for (int i = 1; i <= N; i++) {

            X = input.nextInt();
            Y = input.nextInt();

            if (X > Y) {
                MAX = X;
                MIN = Y;
            }

            else {
                MAX = Y;
                MIN = X;
            }

            for (int j = MIN + 1 ; j < MAX; j++) {

                if (j % 2 != 0) {
                    soma += j;
                }

            } 

            System.out.println(soma);
            soma = 0;

        }

    }
}