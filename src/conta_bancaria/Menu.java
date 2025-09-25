package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {
	
	private static final Scanner leia = new Scanner(System.in);
	private static final ContaController contaController = new ContaController();

	public static void main(String[] args) {
						
		int opcao;
		
		criarContasTeste();
		
		while (true) {
					
		System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND
			    + "************************************************\n"
			    + "*                                              *\n"
			    + "*                 NABANK                       *\n"
			    + "*______________________________________________*\n"
			    + "*                                              *\n"
			    + "*   1 - Criar Conta                            *\n"
			    + "*   2 - Listar todas as Contas                 *\n"
			    + "*   3 - Buscar Conta por Numero                *\n"
			    + "*   4 - Atualizar Dados da Conta               *\n"
			    + "*   5 - Apagar Conta                           *\n"
			    + "*   6 - Sacar                                  *\n"
			    + "*   7 - Depositar                              *\n"
			    + "*   8 - Transferir valores entre Contas        *\n"
			    + "*   0 - Sair                                   *\n"
			    + "*                                              *\n"
			    + "*______________________________________________*\n"
			    + "*  Entre com a opção desejada:                 *\n"
			    + "************************************************"
			    + Cores.ANSI_RESET);

		try {
			opcao = leia.nextInt();
			leia.nextLine();
		}catch(InputMismatchException e){
			opcao = -1;
			System.out.println("\nDigite um número inteiro entre 0 e 8");
			leia.nextLine();
		}
		
		if (opcao == 0) {
			System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "\nNABANK - O rosinha da economia");
			sobre();
			 leia.close();
			 System.exit(0);
		}
		
		switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Criar Conta\n\n");
				
				keyPress();
				break;
				
			case 2:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Listar todas as Contas\n\n");
				
				listarContas();
				
				keyPress();
				break;
				
			case 3:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +"Buscar Conta por Numero\n\n");
				
				keyPress();
				break;
				
			case 4:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +"Atualizar Dados da Conta\n\n");
				
				keyPress();
				break;
				
			case 5:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +"Apagar a conta\n\n");
				
				keyPress();
				break;
				
			case 6:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +"Sacar\n\n");
				
				keyPress();
				break;
				
			case 7:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +"Depositar\n\n");
				
				keyPress();
				break;
				
			case 8:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +"Transferir valores entre Contas\n\n");
				
				keyPress();
				break;
				
			default:
				System.out.println(Cores.TEXT_RED_BOLD +"Opção Inválida!\n" + Cores.TEXT_RESET);
				keyPress();
				break;
				
		}
				
	}

}
	
	public static void sobre() {
		System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND + "**********************************************");
		System.out.println("* Projeto Desenvolvido por:                   ");
		System.out.println("* Nayara Kiyota                               ");
		System.out.println("* github.com/nayarakiyota                     ");
		System.out.println("**********************************************" + Cores.TEXT_RESET);
		
		}
	//keyPress para rodar o menu depois de apertar o enter
	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione enter para continuar...");
		leia.nextLine();
	}
	
	private static void criarContasTeste() {
		contaController.cadastrar(new ContaCorrente(1, 456, 1, "Thuany Silva", 1000000.00f, 100000.00f));
		contaController.cadastrar(new ContaPoupanca(2, 456, 2, "Marcia Condarco", 1000000.00f, 10));
	}
	
	private static void listarContas() {
		contaController.listarTodas();
	}
			
}
