package questao3B;

import java.util.Comparator;

public class OrdenaData implements Comparator<Empregado>{

	@Override
	public int compare(Empregado proleta1, Empregado proleta2) {
		if(proleta1.getData() < proleta2.getData()) {
			return -1;
		}
		
		if(proleta1.getData() > proleta2.getData()) {
			return 1;
		}
		return 0;
	}

}
