import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N , X;

        N = input.nextInt();

        for ( int i = 1 ; i <= N  ; i++){
            double A, B, C,media;

            A = input.nextDouble();
            B = input.nextDouble();
            C = input.nextDouble();

            media = ((A * 0.2) + (B * 0.3) + (C * 0.5));

            System.out.printf("%.1f\n",media);
        }
         
    }
}