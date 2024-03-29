/*
Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), 
e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".
*/

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
 
        int kmPercorrido = sc.nextInt();
        double totalCombustivel = sc.nextDouble();
        
        double tot = kmPercorrido / totalCombustivel;
        
        System.out.printf("%.3f km/l\n", tot);
        sc.close();
    }
}
