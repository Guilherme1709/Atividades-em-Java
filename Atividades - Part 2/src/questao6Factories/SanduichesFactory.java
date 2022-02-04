package questao6Factories;

public class SanduichesFactory {
	public static SanduichesIngredientFactory GetFactoryCG(String fabrica) {
		if (fabrica.equalsIgnoreCase("pão")) {
			return new PaoFactory();
		}
		
		else if(fabrica.equalsIgnoreCase("presunto")) {
			return new PresuntoFactory();
		}
		
		else if(fabrica.equalsIgnoreCase("queijo")) {
			return new QueijoFactory();
		}
		
		else if(fabrica.equalsIgnoreCase("salada")) {
			return new SaladaFactory();
		}
		
		return null;
	}
}
