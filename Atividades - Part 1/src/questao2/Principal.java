package questao2;
import java.util.*;

public class Principal {
	public static void main(String[] args) {
		Map<String, Funcionario> mapa = new HashMap<String, Funcionario>();
		
		Funcionario f1 = new Funcionario("Givanildo Vieira de Sousa", "R$2.000.000", "Jogador (Atacante)");
		Funcionario f2 = new Funcionario("Adenor Leonardo Bachi", "R$18.300.000", "Técnico");
		Funcionario f3 = new Funcionario("Alisson Becker", "R$2.668.000", "Jogador (Goleiro)");	
		
		mapa.put("Ab777".toLowerCase(), f1);
		mapa.put("bC000".toLowerCase(), f2);
		mapa.put("Xz111".toLowerCase(), f3);
		
		Funcionario func1 = mapa.get("aB777".toLowerCase());
		Funcionario func2 = mapa.get("Bc000".toLowerCase());
		Funcionario func3 = mapa.get("xz111".toLowerCase());
		
		System.out.println(func1.toString());
		System.out.println(func2.toString());
		System.out.println(func3.toString());
	}
	
}
