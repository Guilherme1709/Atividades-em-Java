package questao6Factories;

import questao6Intefaces.*;

public abstract class SanduichesIngredientFactory {
	public abstract PaoIF escolhePao(String pao);
	public abstract PresuntoIF escolhePresunto(String presunto);
	public abstract QueijoIF escolhQueijo(String queijo);
	public abstract SaladaIF escolheSalada(String salada);
}
