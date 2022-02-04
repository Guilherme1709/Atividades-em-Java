package questao3B;

import java.util.Comparator;

public class OrdenaNome implements Comparator<Empregado> {

	@Override
    public int compare(Empregado proleta1, Empregado proleta2) {
        return proleta1.getNome().
                compareTo(proleta2.getNome());
    }
	

}
