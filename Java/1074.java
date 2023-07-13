import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N , X;

        N = input.nextInt();
        
        for ( int i = 1 ; i <= N ; i++){
            X = input.nextInt();

            if ( X % 2 == 0 && X != 0){
                System.out.printf("EVEN ");
            }
            if (X % 2 != 0){
                System.out.printf("ODD ");
            }
            if (X >= 1){
                System.out.printf("POSITIVE\n");
            }
            if ( X <= -1){
                System.out.printf("NEGATIVE\n");
            }
            if ( X == 0) {
                System.out.printf("NULL\n");
            }
        }

    }
}