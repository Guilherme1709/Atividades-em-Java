package questao1B;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {
	public static void main(String[] args) {
		int opcao = 0;
		Set<String> set = new HashSet<String>();
		
		Scanner inputMenu = new Scanner(System.in);
		
		Produto prodObj= new Produto();
		
		System.out.println("Bem-vindo!");
		while(true) {
			System.out.println("\nQual operacao deseja fazer?");
			System.out.println("1 - Cadastrar produto;\n2 - Imprimir produtos cadastrados;\n0- Sair do programa.\n");
			opcao = inputMenu.nextInt();
			
			if(opcao == 1)
				prodObj.recebeDados(set);
			
			if(opcao == 2)
				prodObj.imprimeProdutos(set);;
			
			if(opcao == 0) {
				System.out.println("Programa encerrado! Obrigado pela preferência!");
				break;
			}
		}
		
		inputMenu.close();
	}
}
