import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double X,Y;
        double media=0;

        X = sc.nextDouble();
        Y = sc.nextDouble();


        media = (X*3.5+Y*7.5)/11;
        

        System.out.printf("MEDIA = %.5f\n",media);
    }
}