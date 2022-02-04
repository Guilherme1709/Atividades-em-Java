package questao1A;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {
	public static void main(String[] args) {
		int opcao = 0;

		Scanner inputMenu = new Scanner(System.in);
		
		Set<String> lista = new HashSet<String>();
		
		Logicas obj = new Logicas();
		
		System.out.println("Bem-vindo!");
		while(true) {
			System.out.println("\nQual operacao deseja fazer?");
			System.out.println("1 - Inserir nomes;\n2 - Imprimir nomes;\n3 - Remover nome da lista;\n4 - Remover duplicatas;\n"
								+ "5 - Verificar nome;\n6 - Apagar todos os nomes;\n0- Sair do programa.\n");
			opcao = inputMenu.nextInt();
			
			if(opcao == 1)
				obj.leNomes(lista);
			
			if(opcao == 2)
				obj.imprimeLista(lista);
			
			if(opcao == 3)
				obj.removeNome(lista);
			
			if(opcao == 4)
				obj.removerDuplicatas(lista);
			
			if(opcao == 5)
				obj.verificaNome(lista);
			
			if(opcao == 6)
				obj.limparNomes(lista);
			
			if(opcao == 0) {
				System.out.println("Programa encerrado! Obrigado pela preferência!");
				break;
			}
		}
		
		inputMenu.close();
	}
}


