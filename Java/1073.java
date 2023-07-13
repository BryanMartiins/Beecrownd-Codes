import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double quadrado=0,X;

        X = input.nextDouble();

        for ( int i = 2 ; i <= X ;i+=2 ){
            quadrado = Math.pow(i,2);
            System.out.printf("%d^2 = %.0f\n",i,quadrado);
        }



        
    }
}