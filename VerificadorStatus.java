/*Cenário: Um sistema de segurança precisa validar se um usuário está ativo ou bloqueado.
Enunciado: Leia um valor booleano estaAtivo. Use o operador ternário para armazenar em uma String a mensagem "Acesso Permitido" (se true) ou "Acesso Bloqueado" (se false).
*/


import java.util.Scanner;

public class VerificadorStatus {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("O usuário está ativo? Digite true or false");
        boolean isActive = sc.nextBoolean();

        String status = (isActive) ? "Acesso permitido" : "Acesso negado";

        System.out.println("Status: " + status);
        

        sc.close();

    }
}
