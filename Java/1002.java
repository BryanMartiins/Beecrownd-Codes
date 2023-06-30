
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;


public class Main {

    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        double raio;
        double area=0;

        raio = sc.nextDouble();

        area = (3.14159 * (raio*raio));
        System.out.printf("A=%.4f\n",area);
    }
}