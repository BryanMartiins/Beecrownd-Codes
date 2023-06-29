import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X, Y, soma = 0;

        X = scanner.nextInt();
        Y = scanner.nextInt();

        if (X > Y) {
            for (int i = Y; i <= X; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
        }

        else {
            for (int i = X; i <= Y; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
        }

        System.out.println(soma);
        
    }
}

