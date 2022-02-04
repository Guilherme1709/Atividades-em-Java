package questao8;

public class Principal {
	public static void main(String[] args) {
		Termometro charizard = new Termometro(new MedidorAdaptador());
		charizard.emCelcius();
	}
}
