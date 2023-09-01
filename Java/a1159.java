import java.util.Scanner;

public class a1159 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X, soma;

        while (true) {

            soma = 0;
            X = input.nextInt();

            if (X != 0) {
                if (X % 2 != 0) {
                    X += 1;
                }

                for (int j = 1; j <= 5; j++) {
                    soma += X;
                    X += 2;
                }
                System.out.println(soma);
            } else {
                break;
            }
        }
    }
}
