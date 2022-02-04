package questao6;

public class Conta{
	private float dinheirinhos;
	
	public void depositar(float dinheirinhos2) {
		this.dinheirinhos += dinheirinhos2;
	}
	
	
	public void sacar(float dinheirinhos2) throws ContaExcecaoGui {
		if(dinheirinhos2 > dinheirinhos) {
			ContaExcecaoGui excecao = new ContaExcecaoGui("\nO seu saldo é inferior ao valor digitado!\n" +
															"Por Favor, digite um valor menor!");
			throw excecao;
		}
		
		this.dinheirinhos -= dinheirinhos2;
	}

	
	public float getDinheirinhos() {
		return dinheirinhos;
	}

	
	public void setDinheirinhos(float dinheirinhos) {
		this.dinheirinhos = dinheirinhos;
	}
	
}
