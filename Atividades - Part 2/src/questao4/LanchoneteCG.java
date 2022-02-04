package questao4;

public class LanchoneteCG extends FabricaAbstrataDeSanduiche {

	@Override
	public Sanduiche FactorySanduiche(String pao, String queijo, String presunto, String salada) {
		if(pao.equals("Integral") && queijo.equals("Prato") 
				&& presunto.equals("De Frango") && salada.equals("Sem Verdura")) {
			return new SandDoCG();
		}
		return new Sanduiche(pao, queijo, presunto, salada);
	}


}
