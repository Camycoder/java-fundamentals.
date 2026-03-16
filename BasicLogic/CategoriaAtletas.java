/*
 * EXERCÍCIO: Classificador de Atletas
 * * OBJETIVO:
 * Escreva um programa que leia a idade e o peso de um atleta. 
 * Com base nesses dados, o programa deve determinar a categoria 
 * do atleta conforme a tabela abaixo:
 * * IDADE              | PESO            | CATEGORIA
 * -------------------|-----------------|------------------
 * Menor que 12 anos  | Qualquer peso   | Infantil
 * De 12 a 17 anos    | Até 60.0 kg     | Juvenil Leve
 * De 12 a 17 anos    | Acima de 60.0 kg| Juvenil Pesado
 * De 18 a 60 anos    | Até 75.0 kg     | Adulto Leve
 * De 18 a 60 anos    | Acima de 75.0 kg| Adulto Pesado
 * Acima de 60 anos   | Qualquer peso   | Sênior
 * * REQUISITOS:
 * - Use a estrutura if-else if-else.
 * - O peso deve ser lido como um valor de ponto flutuante (double).
 * - Certifique-se de tratar os limites de idade corretamente (ex: quem tem 17 anos).
 */

import java.util.Scanner;

public class CategoriaAtletas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int idade = sc.nextInt();

        System.out.println("Digite o seu peso:");
        double peso = sc.nextDouble();

        if (idade < 12) {
            System.out.println("Classificação: Infantil");
        } 
        else if (idade >= 12 && idade <= 17 && peso <= 60.0) {
            System.out.println("Classificação: Juvenil Leve");
        } 
        else if (idade >= 12 && idade <= 17 && peso > 60.0) {
            System.out.println("Classificação: Juvenil Pesado");
        } 
        else if (idade >= 18 && idade <= 60 && peso <= 75.0) {
            System.out.println("Classificação: Adulto Leve");
        } 
        else if (idade >= 18 && idade <= 60 && peso > 75.0) {
            System.out.println("Classificação: Adulto Pesado");
        } 
        else {
            System.out.println("Classificação: Sênior");
        }

        sc.close();
    } 
}