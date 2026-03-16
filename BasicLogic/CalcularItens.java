/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar. */

package BasicLogic;

import java.util.Scanner;

public class CalcularItens {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o código do produto: ");
        int codigo = sc.nextInt();

         System.out.println("Digite a quantidade do produto: ");
        int quantidade = sc.nextInt();

        double preco;

        if(codigo == 1){
            preco = 4.00;

        }
        else if (codigo == 2 ){
            preco = 4.50;

        }
        else if(codigo == 3){
            preco = 5.00;

        } else if(codigo ==4 ){
            preco = 2.00;

        } else {
            preco = 1.50;
        }

        double total = preco * quantidade;

        System.out.printf("TOTAL: R$ %.2f%n " , total );


        sc.close();

    }
    

}
