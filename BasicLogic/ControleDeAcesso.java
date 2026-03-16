/*
 * EXERCÍCIO: Sistema de Controle de Acesso
 * Criar um programa que leia o nível de acesso de um usuário (String)
 * e exiba suas permissões no sistema usando a estrutura SWITCH-CASE.
 * * REGRAS:
 * - "admin": Exibir "Acesso total: Gerenciamento de usuários e configurações."
 * - "user":  Exibir "Acesso padrão: Edição de perfil e leitura de dados."
 * - "guest": Exibir "Acesso limitado: Apenas leitura de documentos públicos."
 * - default: Exibir "Acesso negado: Nível de usuário não identificado."
 */

import java.util.Scanner;

    public class ControleDeAcesso {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

            System.out.println("Digite o seu nível de acesso: ");
            String user = sc.next().toLowerCase();

            switch(user) {
                case "adm":
                    System.out.println("Acesso total: Gerenciamento de usuários e configurações");
                    break;
                
                case "user":
                    System.out.println("Acesso padrão: Edição de perfil e leitura de dados");
                    break;

                case "guest":
                    System.out.println("Acesso limitado: Apenas leitura de documentos públicos");
                    break;

                default:
                    System.out.println("Acesso negado: nível de usuário não identificado");
                    break;

                 }

                 sc.close();

            }

        }


