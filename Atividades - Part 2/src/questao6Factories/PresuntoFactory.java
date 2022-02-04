package questao6Factories;

import questao6.*;
import questao6Intefaces.*;

public class PresuntoFactory extends SanduichesIngredientFactory {

	@Override
	public PaoIF escolhePao(String pao) {
		return null;
	}

	@Override
	public PresuntoIF escolhePresunto(String presunto) {
		if(presunto == null)
			return null;
		
		if(presunto.equalsIgnoreCase("frango")) {
			return new PresuntoDeFrango();
		}
		
		else if(presunto.equalsIgnoreCase("peru")) {
			return new PresuntoDePeru();
		}
		
		return null;
	}

	@Override
	public QueijoIF escolhQueijo(String queijo) {
		return null;
	}

	@Override
	public SaladaIF escolheSalada(String salada) {
		return null;
	}

}
