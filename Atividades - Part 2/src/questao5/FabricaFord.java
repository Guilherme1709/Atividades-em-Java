package questao5;

public class FabricaFord implements InterfaceDaFabrica {

	@Override
	public InterfaceSedan criarCarroSedan() {
		return new FiestaSedan();
	}

	@Override
	public InterfacePopular criarCarroPopular() {
		return new Fiesta();
	}

}
