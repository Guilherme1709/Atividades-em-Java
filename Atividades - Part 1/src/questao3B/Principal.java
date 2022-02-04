package questao3B;
import java.util.*;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Empregado> empresa = new ArrayList<Empregado>();
		
		OrdenaSalario ordSal = new OrdenaSalario();
		OrdenaNome ordNome = new OrdenaNome();
		
		
		Empregado proleta1 = new Empregado("CP3", "Chris Paul", 1500, 2011);
		Empregado proleta2 = new Empregado("R2D2", "Robotinik", 5250.9, 2001);
		Empregado proleta3 = new Empregado("C3PO", "Optimus Prime" , 1200, 2020);
		
		empresa.add(proleta1);
		empresa.add(proleta2);
		empresa.add(proleta3);
		
		Collections.shuffle(empresa);
		System.out.println("Funcionários antes da ordenação: ");
		imprimeDados(empresa);

		System.out.println("\nFuncionários ordenados pelo salário: ");

		Collections.sort(empresa, ordSal);
		imprimeDados(empresa);
		
		System.out.println("\nFuncionários ordenados pelo nome: ");
		Collections.sort(empresa, ordNome);
		imprimeDados(empresa);
	}
	
	
	public static void imprimeDados(ArrayList<Empregado> empresa) {
		for(Empregado emp : empresa) {
			System.out.println("\nID: " + emp.getID() + "\nNome: " + emp.getNome() + "\nSalário: " + emp.getSalario() + "\nData: " + emp.getData());
		}
	}
}

