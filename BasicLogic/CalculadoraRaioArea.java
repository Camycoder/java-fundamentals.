/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159 */


import java.util.Scanner;

    public class CalculadoraRaioArea  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double raio =sc.nextDouble();

       final double pi = 3.14159;
       double area = pi*  Math.pow(raio , 2);

        System.out.printf("A=%.4f%n", area);


        sc.close();

    }





    
}
