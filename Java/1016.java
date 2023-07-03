import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        int x1,distancia;

        x1 = input.nextInt();
        distancia = x1*2;

        System.out.printf("%d minutos\n",distancia);


  
    }
}