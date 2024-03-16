import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempoGasto = sc.nextInt();
        int velocidadeMedia = sc.nextInt();

        double totalPercorrido = (tempoGasto * velocidadeMedia);

        double qtdCombustivelGasto = totalPercorrido / 12;

        System.out.printf("%.3f\n", qtdCombustivelGasto);

        sc.close();
    }
}
