/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */

package BasicLogic;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if(num %2 ==0) {
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }

        sc.close();




    }
}
