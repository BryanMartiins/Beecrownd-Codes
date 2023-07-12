import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int X, Y, maior, menor, soma = 0;

        X = input.nextInt();
        Y = input.nextInt();

        if (X > Y) {
            maior = X;
            menor = Y;

        } else {
            maior = Y;
            menor = X;
        }

        for (int i = menor + 1; i < maior; i++) {

            if (i % 2 != 0) {
                soma += i;
            }

        }
        System.out.println(soma);

    }
}