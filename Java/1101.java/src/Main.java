import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M,N = 0,soma=0,aux;

        while  (((M = sc.nextInt()) > 0) && ((N=sc.nextInt()) >0))  {
    
            if (M>N) {

                for (int i = N; i <= M; i++) {
                    soma += i;
                    System.out.printf("%d ", i, "\n");
                }

                System.out.println("Sum="+soma);
                soma=0;
            }
            else {
                for (int i = M;i <= N; i++){
                    soma+=i;
                    System.out.printf("%d ",i,"\n");
                }
                System.out.println("Sum="+soma);
                soma=0;
            }

        }
    }
}