package questao3B;

import java.util.Comparator;

public class OrdenaSalario implements Comparator<Empregado>{
	
	@Override
	public int compare(Empregado proleta1, Empregado proleta2) {
		if(proleta1.getSalario() < proleta2.getSalario()) {
			return -1;
		}
		
		if(proleta1.getSalario() > proleta2.getSalario()) {
			return 1;
		}
		return 0;
	}
	
}

