package questao5;

public class Principal {
	public static void main(String[] args) {
		InterfaceDaFabrica novaFabrica = new FabricaFiat();
		
		InterfaceSedan novoSedan = novaFabrica.criarCarroSedan();
		InterfacePopular novoPopular = novaFabrica.criarCarroPopular();
		
		novoSedan.exibirInfoSedan();
		novoPopular.exibirInfoPopular();


		novaFabrica = new FabricaFord();
		
		novoSedan = novaFabrica.criarCarroSedan();
		novoPopular = novaFabrica.criarCarroPopular();
		
		novoSedan.exibirInfoSedan();
		novoPopular.exibirInfoPopular();
	}
}
