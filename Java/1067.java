
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        double X;


        X = input.nextDouble();
        for (int i = 0; i <=X ; i++) {

            if (i % 2 !=0){
                System.out.println(i);
            }
        }
    }
}