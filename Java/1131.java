import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int G, I, gremio = 0, inter = 0, empates = 0, repeat, grenal = 1;

        while (true) {
            I = input.nextInt();
            G = input.nextInt();

            if (G > I) {

                gremio++;

            } else if (I > G) {

                inter++;

            } else {

                empates++;
            }
            boolean ver = false;
            while (true) {
                System.out.println("Novo grenal (1-sim 2-nao)");
                repeat = input.nextInt();

                if (repeat == 1) {
                    grenal++;
                    break;

                } else if (repeat == 2) {

                    ver = true;
                    break;

                }
            }
            if (ver) {
                break;
            }
        }

        System.out.printf("%d grenais\n", grenal);
        System.out.printf("Inter:%d\n", inter);
        System.out.printf("Gremio:%d\n", gremio);
        System.out.printf("Empates:%d\n", empates);

        if (inter > gremio) {
            System.out.println("Inter venceu mais");
        }

        else {
            System.out.println("Gremio venceu mais");
        }
    }
}
