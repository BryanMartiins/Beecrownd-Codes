import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int X , Y;

        for ( X = 1, Y = 60 ; Y != -5 ; X+=3 , Y-=5){
            System.out.printf("I=%d J=%d\n",X,Y);
        }
    }
}