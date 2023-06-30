
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;


public class Main {

    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        int X, Y, soma=0;

        X = sc.nextInt();
        Y = sc.nextInt();
        
        soma= X+Y;
        System.out.println("SOMA = "+ soma);
    }
}