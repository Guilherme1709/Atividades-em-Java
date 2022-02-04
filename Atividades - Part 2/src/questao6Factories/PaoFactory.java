package questao6Factories;

import questao6.*;
import questao6Intefaces.*;

public class PaoFactory extends SanduichesIngredientFactory{

	@Override
	public PaoIF escolhePao(String pao) {
		if (pao == null)
			return null;
		
		if(pao.equalsIgnoreCase("integral")) {
			return new PaoIntegral();
		}
		
		else if(pao.equalsIgnoreCase("bola")) {
			return new PaoBola();
		}
		
		else if(pao.equalsIgnoreCase("francês")) {
			return new PaoFrances();
		}
		
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
		return null;
	}



}
