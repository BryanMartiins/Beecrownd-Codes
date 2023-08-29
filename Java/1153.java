import java.util.Scanner;
public class 1153 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        int N, fat=1;

        N = input.nextInt();

        for (int i = 1 ; i<=N; i++){
            fat*=i;
        }
        System.out.println(fat);

    }
}
