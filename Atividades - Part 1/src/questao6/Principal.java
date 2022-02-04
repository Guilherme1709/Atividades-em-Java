package questao6;

public class Principal {
	public static void main(String[] args) throws ContaExcecaoGui {
		Conta contaObj = new Conta();
		
		contaObj.depositar(200);
		contaObj.setDinheirinhos(200);
		contaObj.sacar(400);
	}	
}
