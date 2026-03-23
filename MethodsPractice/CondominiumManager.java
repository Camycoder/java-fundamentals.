

import java.util.Scanner;

public class CondominiumManager {
    
    /* criando um sensor de presenca */
    public String deveAcenderLuz (boolean temMovimento, boolean estaEscuro){
        if(temMovimento && estaEscuro){
            return "Sim, acender.";

        } else{
            return "Nao, apagar";
        }

    }


    /*criando um o formatador de cracha p/ acesso */
    
    public String gerarTextoCracha(String nome, int numeroApartamento){

        return "Acesso liberado: " + nome + " Unidade: " + numeroApartamento;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        CondominiumManager manager = new CondominiumManager();

        System.out.println("Digite seu nome:");
        String name = sc.nextLine();


        System.out.println("Digite o numero do apto: ");
        int apto = sc.nextInt();

        String resultado = manager.gerarTextoCracha(name, apto);

        System.out.println(resultado); 

        sc.close();
    }
}
