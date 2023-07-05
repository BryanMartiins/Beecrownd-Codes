import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int tempoDias, ano, meses, dias;

        tempoDias = input.nextInt();

        ano = tempoDias/365;
        meses = (tempoDias%365)/30;
        dias = ((tempoDias%365) %30);


        System.out.printf("%d ano(s)\n",ano);
        System.out.printf("%d mes(es)\n",meses);
        System.out.printf("%d dia(s)\n",dias);


    }
}
