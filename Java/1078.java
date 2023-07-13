import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N , X;

        N = input.nextInt();

        for ( int i = 1 ; i < 11 ; i++){
            int mult;
            mult = N*i;
            System.out.printf("%d x %d = %d\n",i,N,mult);
        }


        
    }
}