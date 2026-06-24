package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {
    private static final Scanner sc = new Scanner(System.in);
    private static final ContaController contaController = new ContaController();


    public static void main(String[] args) {
    	
        int opcao;
        criarContasTeste();
        
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

            try {
            	opcao = sc.nextInt();
            	sc.nextLine();
            } catch (InputMismatchException e) {
            	opcao = -1;
            	System.out.println("Digite um número inteiro entre 0 e 8. ");
            	sc.nextLine();
            }
            
            if (opcao == 0) {
                System.out.println(Cores.TEXT_RED_UNDERLINED + "\nBANCO DO BRASIL - O seu Futuro começa aqui!" + Cores.TEXT_RESET);
                sobre();
                sc.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
                    cadastrarConta();
                    keyPress();
                    break;
                case 2:
                    System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
                    listarContas();
                    keyPress();
                    break;
                case 3:
                    System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");
                    keyPress();
                    break;
                case 4:
                    System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
                    keyPress();
                    break;
                case 5:
                    System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
                    keyPress();
                    break;
                case 6:
                    System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
                    keyPress();
                    break;
                case 7:
                    System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
                    keyPress();
                    break;
                case 8:
                    System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
                    keyPress();
                    break;
                default:
                    System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
                    keyPress();
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
    
    public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
		sc.nextLine();
	}
    
    public static void criarContasTeste() {
    	contaController.cadastrar(new ContaCorrente(contaController.gerarNumero(), 456, 1, "Thuany Silva", 1000000.00f, 100000.00f));
		contaController.cadastrar(new ContaPoupanca(contaController.gerarNumero(), 456, 2, "Marcia Condarco", 1000000.00f, 10));
    }
    
    public static void listarContas() {
    	contaController.listarTodas();
    }
    
    public static void cadastrarConta() {
    	
    	System.out.println("Digite o número da agência: ");
    	int agencia = sc.nextInt();
    	System.out.println("Digite o tipo da conta (CC - 1 | CP - 2): ");
    	int tipo = sc.nextInt();
    	System.out.println("Digite o nome do titular da conta: ");
    	sc.skip("\\R");
    	String titular = sc.nextLine();
    	System.out.println("Digite o saldo da conta: ");
    	float saldo = sc.nextFloat();
    	
    	switch(tipo) {
    	case 1 ->{
    		System.out.println("Digite o limite da conta: ");
    		float limite = sc.nextFloat();
    		sc.nextLine();
    		contaController.cadastrar(new ContaCorrente
    				(contaController.gerarNumero(), agencia, tipo, titular, saldo, limite));    	
    	}
    	case 2 ->{
    		System.out.println("Digite o dia do seu aniversario: ");
    		int aniversario = sc.nextInt();
    		sc.nextLine();
    		contaController.cadastrar(new ContaPoupanca
    				(contaController.gerarNumero(), agencia, tipo, titular, saldo, aniversario));    	
    	}
    	default -> System.out.println(Cores.TEXT_RED + "TIPO DE CONTA INVALIDA!" + Cores.TEXT_RESET);
    	}
    }
}
