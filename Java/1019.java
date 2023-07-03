import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int Tempo, hours, minutes, seconds;

        Tempo = input.nextInt();

        hours = (Tempo / 60) / 60;
        minutes = (Tempo / 60) % 60;
        seconds = (Tempo % 60);

        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);

    }
}
