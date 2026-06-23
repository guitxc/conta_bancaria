package conta_bancaria;

import java.util.Scanner;
import conta_bancaria.util.Cores;
import model.Conta;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        Conta c1 = new Conta(1, 123, 1, "Isabella", 200000.00f);
		c1.visualizar();
		
		Conta c2 = new Conta(1, 123, 2, "Thiago", 100000.00f);
		c2.visualizar();
		
		/* Alteração do Saldo*/
		c1.setSaldo(300000.00f);
		c1.setTitular("Isabella Bruno");
		c1.visualizar();
		
		/**
		 * Saque na conta c2
		 * if ternário
		 * 
		 * condição ? ação se for verdadeiro : ação se for falso
		 * */
		
		System.out.println("\nSacar R$ 1.000,00 da conta C2: " + (c2.sacar(1000.00f) ? 
				"Saque efetuado com sucesso!" : "Saldo Insuficiente"));
		
		System.out.println("\nSacar R$ 300.000,00 da conta C2: " + (c2.sacar(300000.00f) ? 
				"Saque efetuado com sucesso!" : "Saldo Insuficiente"));
		
		c2.visualizar();
		
		/* Depósito na Conta c2*/
		
		c2.depositar(50000.00f);
		c2.visualizar();
	

        while (true) {
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*****************************************************************************************************");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*                                                                                                   *");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*                                          BANCO DO BRASIL                                          *");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*                                                                                                   *");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*****************************************************************************************************");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*                                                                                                   *");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*                                  1 - Criar Conta                                                  *");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*                                  2 - Listar todas as Contas                                       *");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*                                  3 - Buscar Conta por Numero                                      *");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*                                  4 - Atualizar Dados da Conta                                     *");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*                                  5 - Apagar Conta                                                 *");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*                                  6 - Sacar                                                        *");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*                                  7 - Depositar                                                    *");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*                                  8 - Transferir valores entre Contas                              *");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*                                  0 - Sair                                                         *");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*                                                                                                   *");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*****************************************************************************************************");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*                                  Escolha a Opção desejada                                         *");
            System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_UNDERLINED + "*                                                                                                   *");
            System.out.print(Cores.TEXT_RESET);

            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println(Cores.TEXT_RED_UNDERLINED + "\nBANCO DO BRASIL - O seu Futuro começa aqui!" + Cores.TEXT_RESET);
                sobre();
                sc.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
                    break;
                case 2:
                    System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
                    break;
                case 3:
                    System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");
                    break;
                case 4:
                    System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
                    break;
                case 5:
                    System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
                    break;
                case 6:
                    System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
                    break;
                case 7:
                    System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
                    break;
                case 8:
                    System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
                    break;
                default:
                    System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
                    break;
            }
        }
    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: ");
        System.out.println("Guilherme Sandoli");
        System.out.println("github.com/...");
        System.out.println("*********************************************************");
    }
}
