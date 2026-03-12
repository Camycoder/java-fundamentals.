/*Peça o preço de 5 produtos, some tudo e aplique:
10% de desconto se o total passar de R$100
Printa o total com e sem desconto */

import java.util.Scanner;

public class CaixaRegistradora {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double total = 0;

        for(int i=1 ; i<6; i++){
            System.out.println("Digite o preço do produto: ");
            double price = sc.nextDouble();
            total = total + price;     

        }

        if(total >100){
            double discount = total *0.1;
            double finalPrice = total - discount;
            System.out.println("O valor da compra com desconto de 10% foi: " + finalPrice);

        }
        
        System.out.println("Valor da compra sem desconto: "+ total);
       
        sc.close();
    }

}
