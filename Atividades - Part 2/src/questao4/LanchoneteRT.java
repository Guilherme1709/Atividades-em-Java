package questao4;

public class LanchoneteRT extends FabricaAbstrataDeSanduiche {

	@Override
	public Sanduiche FactorySanduiche(String pao, String queijo, String presunto, String salada) {
		if(pao.equals("Bola") && queijo.equals("Cheddar") 
				&& presunto.equals("De Peru") && salada.equals("Sem Verdura")) {
			return new SandDoRT();
		}
		return new Sanduiche(pao, queijo, presunto, salada);
	}

}
