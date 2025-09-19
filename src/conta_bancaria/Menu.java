package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
		
		System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND + "***********************************************");
		System.out.println("                                               ");
		System.out.println(" 	      	NABANK       		               ");
		System.out.println("_______________________________________________");
		System.out.println("                                               ");
		System.out.println(" 	 1 - Criar Conta                  		   ");
		System.out.println(" 	 2 - Listar todas as Contas       	       ");
		System.out.println(" 	 3 - Buscar Conta por Numero    		   ");
		System.out.println(" 	 4 - Atualizar Dados da Conta              ");
		System.out.println(" 	 5 - Apagar Conta 			               ");
		System.out.println(" 	 6 - Sacar 					               ");
		System.out.println(" 	 7 - Depositar				               ");
		System.out.println(" 	 8 - Transferir valores entre Contas       ");
		System.out.println(" 	 0 - Sair 					               ");
		System.out.println("                                               ");
		System.out.println("_______________________________________________");
		System.out.println("  Entre com a opção desejada:                  ");
		System.out.println("***********************************************" + Cores.TEXT_RESET);
		
		opcao = leia.nextInt();
		
		if (opcao == 0) {
			System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "\nNABANK - O rosinha da economia");
			sobre();
			 leia.close();
			 System.exit(0);
		}
		
		switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Criar Conta\n\n");
				break;
				
			case 2:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Listar todas as Contas\n\n");
				break;
				
			case 3:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +"Buscar Conta por Numero\n\n");
				break;
				
			case 4:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +"Atualizar Dados da Conta\n\n");
				break;
				
			case 5:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +"Apagar a conta\n\n");
				break;
				
			case 6:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +"Sacar\n\n");
				break;
				
			case 7:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +"Depositar\n\n");
				break;
				
			case 8:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +"Transferir valores entre Contas\n\n");
				break;
				
			default:
				System.out.println(Cores.TEXT_RED_BOLD +"Opção Inválida!\n" + Cores.TEXT_RESET);
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
			
	}
