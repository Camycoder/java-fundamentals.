/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente. */

package BasicLogic;

import java.util.Scanner;

public class NumerosMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 =sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 =sc.nextInt();

        if (num1 % num2 == 0|| num2 % num1 ==0) {
            System.out.println("SAO MULTIPLOS ");

        }
        else {
            System.out.println("NAO SAO MULTIPLOS");
        }
        sc.close();


    }
}
