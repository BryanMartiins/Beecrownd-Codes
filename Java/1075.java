import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N , X;

        N = input.nextInt();

        for ( int i = 0 ; i <= 10000 ; i++){

            if ( i % N == 2){
                System.out.println(i);
            }

        }


        
    }
}