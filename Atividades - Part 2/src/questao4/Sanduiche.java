package questao4;

public class Sanduiche {
	private String pao;
	private String queijo;
	private String presunto;
	private String salada;
	
	protected Sanduiche(String pao, String queijo, String presunto, String salada) {
		this.pao = pao;
		this.queijo = queijo;
		this.presunto = presunto;
		this.salada = salada;
	}

	public String getPao() {
		return pao;
	}

	public String getQueijo() {
		return queijo;
	}

	public String getPresunto() {
		return presunto;
	}
	
	public String getSalada() {
		return salada;
	}

	@Override
	public String toString() {
		return "Sanduiche Montado: " + "\nPão: " + pao + "\nQueijo: " + queijo + "\nPresunto: " + presunto + "\nSalada: " + salada + "\n";
	}
	
	
	
}
