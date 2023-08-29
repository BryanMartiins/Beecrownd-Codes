import java.util.Scanner;

public class 1149 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int soma = 0, A, N;

        A = input.nextInt();
        N = input.nextInt();

        while (N <= 0) {
            N = input.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            soma += A;
            A++;
        }
        System.out.println(soma);
    }
}
