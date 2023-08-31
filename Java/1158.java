import java.util.Scanner;

public class a1158 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N, X, Y, soma = 0;
        N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            

            X = input.nextInt();
            Y = input.nextInt();

            if (X % 2 == 0) {
                X++;
            }

            for (int K = 0; K <= Y-1; K++) {
                soma+=X;
                X+=2;
                
            }
            
            System.out.println(soma);
            soma = 0;
        }
    }
}
