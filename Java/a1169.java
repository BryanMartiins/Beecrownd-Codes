import java.util.Scanner;

public class a1169 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int x;
        double result;


        n = input.nextInt();

        for (int i = 0; i < n; i++) {

            x = input.nextInt();
            
            result = Math.pow (2,x)/ 12000;
           

            System.out.printf("%d kg \n", (int)result);
   

        }
    }
}