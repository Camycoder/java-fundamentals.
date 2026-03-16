/*Peça um número ao usuário e printa a tabuada dele de 1 até 10. */

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        for (int i = 1; i<=10; i++){
            
            System.out.println(num + " x " +  i +  " = " + num * i);

        }

        sc.close();
    }
}
