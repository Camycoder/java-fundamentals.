/*
 * EXERCÍCIO: Cálculo de Imposto de Renda 
 * 
 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa. 
 * Em seguida, calcule e mostre o valor do imposto baseado na faixa em que o 
 * salário se encontra:
 * * RENDIMENTO                      | IMPOSTO
 * --------------------------------|----------
 * de 0.00 a R$ 2000.00            | Isento
 * de R$ 2000.01 até R$ 3000.00    | 8% sobre o valor total
 * de R$ 3000.01 até R$ 4500.00    | 18% sobre o valor total
 * acima de R$ 4500.00             | 28% sobre o valor total
 * * Se o valor for isento, deve imprimir a mensagem "Isento".
 * Caso contrário, imprima o valor do imposto com duas casas decimais.
 */



package BasicLogic;

import java.util.Scanner;

public class CalculoImposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Digite o valor do seu salário: ");
        double salario = sc.nextDouble();

        if(salario >=0 && salario <= 2000){
            System.out.println("Isento de pagar o imposto de renda!");

        }
        else if(salario > 2000.0 && salario <=3000){
            double valorImposto= salario * 0.08;
            System.out.printf("O valor do imposto a ser pago será: R$%.2f%n " , valorImposto) ;

        }
        else if(salario >3000.0 && salario <= 4500.0){
            double valorImposto = salario * 0.18;
            System.out.printf("O valor do imposto a ser pago será: R$%.2f%n " , valorImposto);

        }   
        else if (salario > 4500.0) {
           
            double valorImposto = salario * 0.28;
            System.out.printf("O valor do imposto a ser pago será: R$ %.2f%n", valorImposto);

        } else {
            // Caso o usuário digite um valor negativo
            System.out.println("Salário inválido!");
        }

        sc.close();

    }


}
