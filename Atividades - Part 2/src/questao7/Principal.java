package questao7;

public class Principal {
	
	public static void main(String[] args) {
		Cliente clienteObj = new Cliente(new SomadorAdaptador());
		clienteObj.executar();
	}
}