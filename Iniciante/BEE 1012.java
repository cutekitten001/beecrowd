/*
Escreva um programa que leia tres valores com ponto flutuante de dupla precisao: A, B e C. Em seguida, calcule e mostre:
a) a area do triangulo retangulo que tem A por base e C por altura.
b) a area do circulo de raio C. (pi = 3.14159)
c) a area do trapezio que tem A e B por bases e C por altura.
d) a area do quadrado que tem lado B.
e) a area do retangulo que tem lados A e B.*/
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        // area do triangulo
        double areaTriangulo = A * C / 2;
        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        
        // area circulo raio
        double pi = 3.14159;
        double areaCirculo = pi * C * C;
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        
        // area trapezio
        double areaTrapezio = (A + B) * C / 2;
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        
        // area quadrado
        double areaQuadrado = B * B;
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        
        // area do retangulo
        double areaRetangulo = A * B;
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
        
        sc.close();
    }
}
