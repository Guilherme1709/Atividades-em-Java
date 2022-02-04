package questao6Factories;

import questao6.*;
import questao6Intefaces.*;

public class SaladaFactory extends SanduichesIngredientFactory {

	@Override
	public PaoIF escolhePao(String pao) {
		return null;
	}

	@Override
	public PresuntoIF escolhePresunto(String presunto) {
		return null;
	}

	@Override
	public QueijoIF escolhQueijo(String queijo) {
		return null;
	}

	@Override
	public SaladaIF escolheSalada(String salada) {
		if (salada == null)
			return null;
		
		if (salada.equalsIgnoreCase("com verdura")) {
			return new SaladaComVerdura();
		}
		
		else if (salada.equalsIgnoreCase("sem verdura")) {
			return new SaladaSemVerdura();
		}
		
		return null;
	}

}
