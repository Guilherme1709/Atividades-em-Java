package questao2;

public class IncrementalGui {
	private static IncrementalGui instancia;

	private static int count = 0;
	private int numero;
	
	private IncrementalGui() {
		numero = ++count;
	}
	
	public static IncrementalGui GetInstance() {
		if(instancia == null) {
			instancia = new IncrementalGui();	
		}
		return instancia;
	}

	public String toString() {
		return "Incremental " + numero;
	}
	
}
