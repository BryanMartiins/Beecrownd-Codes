import java.util.Locale;
import java.util.Scanner;

public class a1160 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int pa, pb, years=0;
        double g1, g2;
        pa = input.nextInt();
        pb = input.nextInt();
        g1 = input.nextDouble();
        g2 = input.nextDouble();

        while (pa <= pb){
            pa += pa * (g1 / 100);
            pb += pb * (g2 / 100);

            years +=1;
        }
        if (years < 101){
            System.out.printf("%d anos.",years);
        }
        else{
            System.out.println("Mais de 1 seculo.");
        }
    }
}
