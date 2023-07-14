import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int X , Y;

        for ( X = 1 ; X <=9; X +=2){
            for (Y = 7 ; Y >=5 ;Y--){
                System.out.printf("I=%d J=%d\n",X,Y);
            }
        }
    }
}