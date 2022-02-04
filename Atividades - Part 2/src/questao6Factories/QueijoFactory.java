package questao6Factories;

import questao6.*;
import questao6Intefaces.*;

public class QueijoFactory extends SanduichesIngredientFactory {

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
		if(queijo == null)
			return null;
		if(queijo.equalsIgnoreCase("cheddar")) {
			return new QueijoCheddar();
		}
		
		else if(queijo.equalsIgnoreCase("prato")) {
			return new QueijoPrato();
		}
		
		else if(queijo.equalsIgnoreCase("mussarela")) {
			return new QueijoMussarela();
		}
		
		return null;
	}

	@Override
	public SaladaIF escolheSalada(String Salada) {
		return null;
	}

}
