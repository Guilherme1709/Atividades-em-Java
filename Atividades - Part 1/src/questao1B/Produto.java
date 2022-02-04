package questao1B;

import java.util.Scanner;
import java.util.Set;

public class Produto {
	private String[] nome = new String[1];
	private String[] preco = new String[1];
	private String[] codigo = new String[1];
	
	Scanner leDados = new Scanner(System.in);
	
	public void recebeDados(Set<String> set) {
		System.out.println("Digite o código: ");
		
		for(String codigo2 : codigo) {
			codigo2 = leDados.next();
			set.add("Código de barras: " + codigo2);
			
			if(!set.add(codigo2)) {
				System.out.println("Atenção, o produto de código " + codigo2 + " já está inserido no sistema!");
				set.remove(codigo2);
				
			} else {
				System.out.println("Digite o preço: ");
				for(String preco2 : preco) {
					preco2 = leDados.next();
					set.add("Preço: " + preco2);
				}
				
				System.out.println("Digite o nome: ");
				for(String nome2 : nome) {
					nome2 = leDados.next();
					set.add("Nome: " + nome2);
				}
			}
		}
	}
	
	public void imprimeProdutos(Set<String> set) {
		System.out.println("*** Produtos cadastrados ***");
		for (String produto : set) {
			System.out.println(produto);
		}
	}
}
