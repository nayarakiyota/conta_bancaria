package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		// Instanciar objetos da classe conta
		
		Conta c1 = new Conta(1, 123, 1, "Cintia Dourado", 500000.00f);
		
		Conta c2 = new Conta(2, 123, 2, "Priscila Lins", 500000.00f);
								
		System.out.println("O Saldo da conta é: " + c1.getSaldo()); 
		
		c1.setSaldo(600000.00f);
		
		System.out.println("O Saldo da conta é: " + c1.getSaldo());
		
		c1.visualizar();
		
		c2.visualizar();
		
		System.out.println(c1.sacar(1000));
		System.out.println("O Saldo da conta é: " + c1.getSaldo()); 
		
		System.out.println(c2.sacar(10000000));
		System.out.println("O Saldo da conta é: " + c2.getSaldo()); 
		
		c1.depositar(5000);
		System.out.println("O Saldo da conta é: " + c1.getSaldo());
		
		// Instanciar objetos da classe ContaCorrente
		
		ContaCorrente cc1 = new ContaCorrente(3, 456, 1, "Thuany Silva", 1000000.00f, 100000.00f);
		
		cc1.visualizar();
		
		// Sacar Conta Corrente
		System.out.println(cc1.sacar(2000000.00f));
		cc1.visualizar();
		
		System.out.println(cc1.sacar(2000.00f));
		cc1.visualizar();
		
		// Depositar Conta Corrente
		cc1.depositar(5000.00f);
		cc1.visualizar();
		
		// Instanciar objetos da classe ContaPoupança
		ContaPoupanca cp1 = new ContaPoupanca(4, 456, 2, "Nayara Kiyota", 7000000.00f, 26);
		
		cp1.visualizar();
		
		
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
