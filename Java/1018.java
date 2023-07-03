import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int valorTotal,div,div2,div3,div4,div5,div6,div7;

        valorTotal = input.nextInt();


        div = valorTotal/100;
        div2 = valorTotal%100 /50;
        div3 = valorTotal%100 %50 /20;
        div4 = valorTotal%100 %50 %20 /10;
        div5 = valorTotal%100 %50 %20 %10 /5;
        div6 = valorTotal%100 %50 %20 %10 %5 /2;
        div7 = valorTotal%100 %50 %20 %10 %5 %2 /1;
         
        System.out.println(valorTotal);
        System.out.printf("%d nota(s) de R$ 100,00\n",div);
        System.out.printf("%d nota(s) de R$ 50,00\n",div2);
        System.out.printf("%d nota(s) de R$ 20,00\n",div3);
        System.out.printf("%d nota(s) de R$ 10,00\n",div4);
        System.out.printf("%d nota(s) de R$ 5,00\n",div5);
        System.out.printf("%d nota(s) de R$ 2,00\n",div6);
        System.out.printf("%d nota(s) de R$ 1,00\n",div7);

    }
}
