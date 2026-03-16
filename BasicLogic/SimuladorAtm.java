/*
 * EXERCÍCIO: Simulador de Caixa Eletrônico (ATM)
 * - Menu interativo com: Ver Saldo, Depositar, Sacar e Sair.
 * - Manter o sistema rodando até o usuário digitar '4'.
 * - Validar saldo antes de permitir o saque.
 * - Praticar: Scanner, While, Switch-Case e If/Else.
 */

package BasicLogic;

import java.util.Scanner;

public class SimuladorAtm {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 1000.00;
        int opcao = 0;

        System.out.println("--- Bem-Vindo ao ATM ---");

        while (opcao != 4) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1- ver saldo");
            System.out.println("2- depositar");
            System.out.println("3 - sacar");
            System.out.println("4 - sair");

            opcao = sc.nextInt(); 

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Quanto deseja depositar? ");
                    double deposito = sc.nextDouble();
                    saldo = saldo + deposito; 
                    System.out.println("Depósito realizado!");
                    break;

                case 3:
                    System.out.print("Quanto deseja sacar? ");
                    double saque = sc.nextDouble();
                    
                    if (saque <= saldo) {
                        saldo = saldo - saque; 
                        System.out.println("Saque realizado!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando sistema... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}