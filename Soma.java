/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos. */

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int a =sc.nextInt();

         System.out.println("Digite o segundo número número: ");
          int b =sc.nextInt();
          
          int soma = (a+b);
         
        System.out.println("SOMA: " + soma);

         sc.close();

    }
}
