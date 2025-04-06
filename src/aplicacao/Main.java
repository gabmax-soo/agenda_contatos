package aplicacao;


import dominio.Agenda;
import dominio.Contato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda contatos = new Agenda();
        int opcao;

        do {
            System.out.println("LISTA DE CONTATOS DOS ALUNOS:");
            System.out.println("1. Adicionar contato ");
            System.out.println("2. Listar contatos ");
            System.out.println("3. Remover contatos ");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone  = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    contatos.adicinarContact( new Contato(nome,telefone,email));
                break;
                case 2:
                    contatos.listarContatos();
                    break;
                case 3:
                    System.out.println("Digite o nome do contato que deseja remover:");
                    String contatoRemover = sc.nextLine();
                    contatos.removerContact(contatoRemover);
                break;

                case 4:
                    System.out.println("Saindo do sistema....");
                break;

                default:
                    System.out.println("Opção invalida!!!");
                break;
            }

        }while(opcao != 4);
        sc.close();
    }
}
