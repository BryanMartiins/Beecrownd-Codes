import java.util.Scanner;

public class 1157 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, N;

        N = input.nextInt();

        for (i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);

            }

        }

    }
}
