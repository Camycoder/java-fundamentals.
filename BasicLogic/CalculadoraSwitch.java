/*
 * EXERCÍCIO: Mini Calculadora Aritmética
 * * OBJETIVO:
 * Leia dois números (double) e um símbolo de operação (char: +, -, *, /).
 * Utilize o SWITCH-CASE para realizar o cálculo correspondente.
 */


package BasicLogic;


import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        System.out.println("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.print("Resultado: ");

        switch (operacao) {
            case '+':
                System.out.printf("%.2f%n", (n1 + n2));
                break;
            case '-':
                System.out.printf("%.2f%n", (n1 - n2));
                break;
            case '*':
                System.out.printf("%.2f%n", (n1 * n2));
                break;
            case '/':
                if (n2 != 0) {
                    System.out.printf("%.2f%n", (n1 / n2));
                } else {
                    System.out.println("Erro! Divisão por zero não permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

        sc.close();
    }
}
