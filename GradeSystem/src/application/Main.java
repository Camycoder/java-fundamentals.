
import entities.Student;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas notas deseja inserir?  ");
        int tamanho = sc.nextInt();

        double [] listaDeNotas = new double[tamanho];

        for(int i = 0;  i < tamanho ; i++){
            System.out.println("Digite as notas: ");
            listaDeNotas[i] = sc.nextDouble();
        }

        System.out.println("Digite seu nome:");
        String name = sc.next();

        System.out.println("Digite seu ID:");
        int ID = sc.nextInt();

        Student s1 = new Student(name, ID , listaDeNotas);
        s1.showReport();





    sc.close();

    }
}
