import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double X, Y, N;


        N = input.nextDouble();

        for ( int i = 1 ; i <= N ; i++ ){
            X = input.nextDouble();
            Y = input.nextDouble();

            if ( X == Y || Y == 0){
                System.out.println("divisao impossivel");
            }
            else {
                double soma = 0;
                soma = X/Y;
                System.out.println(soma);
            }

        }

       
    }
}