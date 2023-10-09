import java.util.Scanner;

public class a1169 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double result,n,x;


        n = input.nextDouble();

        for (int i = 0; i < n; i++) {

            x = input.nextDouble();
            
            result = Math.pow (2,x)/ 12000;
           
            result -=(result%1);

            System.out.printf("%.0f kg\n", result);
   

        }
    }
}