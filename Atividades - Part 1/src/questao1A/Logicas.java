package questao1A;
import java.util.Scanner;
import java.util.Set;

public class Logicas {
	Scanner	inputNomes = new Scanner(System.in);
	private String[] recebeNomes = new String[3];
	
	public void leNomes (Set<String> lista) {
		System.out.println("Digite o nome: ");
		
		for(String nome : recebeNomes) {
			nome = inputNomes.next();
			lista.add(nome);
		}
	}
	
	public void imprimeLista(Set<String> lista) {
		for (String nome : lista) {
			System.out.println(nome);
		}
	}
	
	public void removerDuplicatas(Set<String> lista) {
		for (String list : lista) {
			System.out.println(list);
		}
	}
	
	public void removeNome(Set<String> lista) {
		System.out.println("Digite o nome que deseja remover: ");
		
		String nome = inputNomes.next();
		lista.remove(nome);

		imprimeLista(lista);
	}
	
	public void limparNomes(Set<String> lista) {
		lista.clear();
		System.out.println("Lista de nomes apagada!");
	}
	
	public void verificaNome(Set<String> lista) {
		int i = 0;
		System.out.println("Digite o nome que deseja verificar: ");

		recebeNomes[i] = inputNomes.next();
	
		if(lista.contains(recebeNomes[i])) {
			System.out.println("O nome está na lista!");
		} else {
			System.out.println("O nome NÃO está na lista!");
		}
	}
}
