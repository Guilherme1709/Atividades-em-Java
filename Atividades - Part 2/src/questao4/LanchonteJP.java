package questao4;

public class LanchonteJP extends FabricaAbstrataDeSanduiche{

	@Override
	public Sanduiche FactorySanduiche(String pao, String queijo, String presunto, String salada) {
		if(pao.equals("Francês") && queijo.equals("Mussarela") 
				&& presunto.equals("De Frango") && salada.equals("Com Verdura")) {
			return new SandDoJP();
		}
		return new Sanduiche(pao, queijo, presunto, salada);
	}

}
