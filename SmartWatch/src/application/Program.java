package src.application;

import src.entities.Smartwatch;
import java.util.Scanner;



public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
       Smartwatch watch1 = new Smartwatch();


       watch1.takeStep();
       System.out.println(watch1);

       watch1.pressBluetoothBottom();

        System.out.println("Qual o nome do dono?: ");
        sc.nextLine();
        String nomeDigitado = sc.nextLine();
        watch1.updateOwner(nomeDigitado);
        

        System.out.println(watch1);
        sc.close();
    }
}
