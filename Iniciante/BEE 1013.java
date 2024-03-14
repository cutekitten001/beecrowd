/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int maior = A;
        
        if (maior < B) {
            maior = B;
        }
        
        if (maior < C) {
            maior = C;
        }

        System.out.printf("%d eh o maior\n", maior);
        sc.close();
    }
}
