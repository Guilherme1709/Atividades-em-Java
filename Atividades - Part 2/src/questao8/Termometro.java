package questao8;

public class Termometro {
	private MedidorCelciusInterface celcinho;
	
	public Termometro(MedidorCelciusInterface celcinho) {
		this.celcinho = celcinho;
	}
	
	public void emCelcius() {
		celcinho.medirTemperatura(50);
	}
}
