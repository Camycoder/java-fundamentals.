/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
 */
package LogicProgramming;

import java.util.Scanner;

public class AvaliandoNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");   
        int num =sc.nextInt();

        if(num >=0){
            System.out.println("NAO NEGATIVO! ");

        }
        else{
            System.out.println("NEGATIVO!" );

        }

        sc.close();
    }


}
