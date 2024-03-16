import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distanciaPercorrida = sc.nextInt();

        int  minutos = (60 * distanciaPercorrida) / 30;

        System.out.println(minutos + " minutos");

        sc.close();
    }
}
