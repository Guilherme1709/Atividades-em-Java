package questao7;

public class Principal {
	public static void main(String[] args) throws ContaExcecaoGui {
		Conta contaObj = new Conta();
		
		contaObj.depositar(200);
		contaObj.setDinheirinhos(200);
		
		System.out.println("Você depositou: R$" + contaObj.getDinheirinhos() + "\n");
		try {
			contaObj.sacar(1500);
		} catch(ContaExcecaoGui excecao) {
			System.out.println("Ops: " + excecao.getMessage());
		}
	}	
}
