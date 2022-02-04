package questao5;

public class FabricaFiat implements InterfaceDaFabrica {

	@Override
	public InterfaceSedan criarCarroSedan() {
		return new Siena();
	}

	@Override
	public InterfacePopular criarCarroPopular() {
		return new Palio();
	}

}
