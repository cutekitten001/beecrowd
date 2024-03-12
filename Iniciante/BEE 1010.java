/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
	    Scanner sc = new Scanner(System.in);
	    
	    int pc1 = sc.nextInt();
	    int pc1Qt = sc.nextInt();
	    double pc1Value = sc.nextDouble();
	    
	    int pc2 = sc.nextInt();
	    int pc2Qt = sc.nextInt();
	    double pc2Value = sc.nextDouble();
	    
	    double total = (pc1Qt * pc1Value) + (pc2Qt * pc2Value);
	    
	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
	    
	    sc.close();
    }
}
