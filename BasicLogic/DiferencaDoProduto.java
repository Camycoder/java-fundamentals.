/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */


package BasicLogic;

import java.util.Scanner;

public class DiferencaDoProduto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int a =sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int b =sc.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int c =sc.nextInt();

        System.out.println("Digite o quarto valor: ");
        int d = sc.nextInt();


        int diferenca =(a*b-c*d);

        System.out.println("DIFERENÇA: " + diferenca);

        sc.close();
    }
    


}
