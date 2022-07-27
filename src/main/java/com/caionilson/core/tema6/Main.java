package com.caionilson.core.tema6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Contato contato = new Contato();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            try {

                System.out.println("-----------------------------");
                System.out.println("Opções: " +
                        "\n 1 - Adicionar " +
                        "\n 2 - Buscar por nome " +
                        "\n 3 - Buscar por ID " +
                        "\n 4 - Listar " +
                        "\n 5 - Deletar " +
                        "\n 6 - Fechar \n");
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.println("\nDigite o nome do contato: ");
                        contato.setNome(scanner.nextLine());
                        System.out.println("\nDigite o telefone do contato: ");
                        contato.setTelefoneContato(scanner.nextLine());
                        agenda.adicionarContatos(new Contato(contato.getNome(), contato.getTelefoneContato()));
                        break;
                    case 2:
                        System.out.println("\nDigite o nome do contato a ser pesquisado: ");
                        String recebePesquisa = scanner.nextLine();
                        System.out.println(agenda.buscaNome(recebePesquisa));
                        break;
                    case 3:
                        System.out.println("\nDigite o ID do contato a ser pesquisado: ");
                        int idPesquisa = Integer.parseInt(scanner.nextLine());
                        if (agenda.buscaId(idPesquisa).isPresent()) {
                            System.out.println(agenda.buscaId(idPesquisa));
                        } else {
                            System.out.println("\nUsuário não encontrado");
                        }
                        break;
                    case 4:
                        System.out.println("\nTodos os usuários cadastrados");
                        agenda.listarContatos();
                        break;
                    case 5:
                        System.out.println("\nDigite o ID do contato que será deletado: ");
                        int removeContato = Integer.parseInt(scanner.nextLine());
                        agenda.removerContatos(removeContato);                     
                        break;
                    default:
                        System.out.println("\nPrograma fechado");
                }
            } catch (NumberFormatException numberFormatException) {
               System.out.println("\nNumber format error " + numberFormatException.getMessage());
            } catch (Exception exception) {
                System.out.println("\nError " + exception.getMessage());
            }
        } while(opcao != 6);
    }
}
