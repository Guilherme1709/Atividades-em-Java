package questao7;

public class Conta{
	private float dinheirinhos;
	
	public void depositar(float dinheirinhos2) {
		this.dinheirinhos += dinheirinhos2;
	}
	
	public void sacar(float dinheirinhos2) throws ContaExcecaoGui {
		if(dinheirinhos2 > dinheirinhos) {
			ContaExcecaoGui excecao = new ContaExcecaoGui("Voc� solicitou um saque no valor de R$" + dinheirinhos2 + 
															"\nPor�m, o seu saldo � R$" + getDinheirinhos() +
															"\nPor Favor, tente sacar um valor menor!");
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
