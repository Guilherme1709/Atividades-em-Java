package questao3A;
import java.util.*;

public class Numero implements Comparable<Numero>, Comparator<Numero>{
	ArrayList<Integer> listaInteiros = new ArrayList<Integer>();
	
	public void addNumeros() {
		for(int i = 0; i < 50; i++) {
			listaInteiros.add(new Random().nextInt(100));
		}
	}
	
	public void imprimeNumeros() {
	     for (int i = 0; i < 1; i++) {
	         System.out.println("Ordem original: \n" + listaInteiros);
	     }
	}
	
	public void ordemCrescente() {
		Collections.sort(listaInteiros);
		
		for(int i = 0; i < 1; i++) {
			System.out.println("\nOrdem crescente: \n" + listaInteiros);
		}
	}

	public void maior_e_menor() {
		int maior = Collections.max(listaInteiros);
		System.out.println("\nMaior número gerado: " + maior);
		
		int menor = Collections.min(listaInteiros);
		System.out.println("Menor número gerado: " + menor);
		
		int frequencia = Collections.frequency(listaInteiros, menor);
		System.out.println("O menor número (" + menor + ") apareceu " + frequencia + " veze(s)");
	}

	@Override
	public int compareTo(Numero listaInteiros) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compare(Numero o1, Numero o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
